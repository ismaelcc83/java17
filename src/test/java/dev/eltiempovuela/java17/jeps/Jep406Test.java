package dev.eltiempovuela.java17.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Jep406Test {

  @Test
  void shouldDescribeHumanObject() {
    Jep406.Human human = new Jep406.Human("Ismael", 42);

    String result = Jep406.checkObjectWithoutPreview(human);

    assertEquals("Human: Ismael, age: 42", result);
  }

  @Test
  void shouldDescribeAlienObject() {
    Jep406.Alien alien = new Jep406.Alien("Wkst", 199, "2M1207 b");

    String result = Jep406.checkObjectWithoutPreview(alien);

    assertEquals("Alien: Wkst, age: 199, planet: 2M1207 b", result);
  }

  @Test
  void shouldDescribeNullObject() {
    String result = Jep406.checkObjectWithoutPreview(null);

    assertEquals("It is null", result);
  }

  @Test
  void shouldDescribeGenericObject() {
    String result = Jep406.checkObjectWithoutPreview("plain text");

    assertEquals("It is an object", result);
  }
}
