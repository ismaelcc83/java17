package dev.eltiempovuela.java17.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep398Test {

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
  void shouldPrintAppletApiDeprecationMessage() {
    Jep398.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 398 - Deprecate the Applet API for Removal"));
    assertTrue(output.contains("The Applet API is deprecated and marked for removal in Java 17."));
    assertTrue(output.contains("Modern browsers no longer support Java Applets."));
    assertTrue(
        output.contains("Uncomment the OldClockApplet class to see the deprecation warning."));
  }
}
