package dev.eltiempovuela.java17.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class Jep395Test {

  @Test
  void shouldCreateRecordWithExpectedValues() {
    Jep395.User user = Jep395.createUser("Ismael", "ismael@eltiempovuela.dev");

    assertEquals("Ismael", user.name());
    assertEquals("ismael@eltiempovuela.dev", user.email());
  }

  @Test
  void shouldCompareRecordsByValue() {
    Jep395.User firstUser = Jep395.createUser("Ismael", "ismael@eltiempovuela.dev");
    Jep395.User secondUser = Jep395.createUser("Ismael", "ismael@eltiempovuela.dev");
    Jep395.User differentUser = Jep395.createUser("Silvia", "silvia@eltiempovuela.dev");

    assertEquals(firstUser, secondUser);
    assertNotEquals(firstUser, differentUser);
  }

  @Test
  void shouldGenerateReadableToString() {
    Jep395.User user = Jep395.createUser("Ismael", "ismael@eltiempovuela.dev");

    assertEquals("User[name=Ismael, email=ismael@eltiempovuela.dev]", user.toString());
  }
}
