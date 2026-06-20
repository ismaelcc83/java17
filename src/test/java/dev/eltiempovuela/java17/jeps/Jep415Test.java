package dev.eltiempovuela.java17.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep415Test {

  private final PrintStream originalOut = System.out;
  private ByteArrayOutputStream outputStream;

  @BeforeEach
  void setUp() {
    outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void shouldAllowExpectedClassAndBlockRejectedClassDuringDeserialization() {
    Jep415.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 415 - Context-Specific Deserialization Filters"));
    assertTrue(output.contains("Allowed: UserSession[username=ismael]"));
    assertTrue(output.contains("Blocked by filter:"));
  }
}
