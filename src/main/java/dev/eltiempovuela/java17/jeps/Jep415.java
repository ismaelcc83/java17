package dev.eltiempovuela.java17.jeps;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jep415 {

  public static void execute() {
    System.out.println("JEP 415 - Context-Specific Deserialization Filters");
    System.out.println("==================================================");

    try {
      deserialize(serialize(new UserSession("ismael")));
      deserialize(serialize(new SuspiciousPayload()));
    } catch (InvalidClassException exception) {
      System.out.println("Blocked by filter: " + exception.getMessage());
    } catch (Exception exception) {
      System.out.println("Unexpected error: " + exception.getMessage());
    }
  }

  private static void deserialize(byte[] data) throws Exception {
    try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(data))) {
      input.setObjectInputFilter(Jep415::filter);

      Object object = input.readObject();

      System.out.println("Allowed: " + object);
    }
  }

  private static ObjectInputFilter.Status filter(ObjectInputFilter.FilterInfo info) {
    Class<?> clazz = info.serialClass();

    if (clazz == null) {
      return ObjectInputFilter.Status.UNDECIDED;
    }

    if (clazz == UserSession.class || clazz == String.class) {
      return ObjectInputFilter.Status.ALLOWED;
    }

    return ObjectInputFilter.Status.REJECTED;
  }

  private static byte[] serialize(Object object) throws Exception {
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    try (ObjectOutputStream objectOutput = new ObjectOutputStream(output)) {
      objectOutput.writeObject(object);
    }

    return output.toByteArray();
  }

  private record UserSession(String username) implements Serializable {}

  private static class SuspiciousPayload implements Serializable {

    @Override
    public String toString() {
      return "SuspiciousPayload";
    }
  }
}
