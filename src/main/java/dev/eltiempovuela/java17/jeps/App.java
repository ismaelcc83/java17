package dev.eltiempovuela.java17.jeps;

import java.io.IOException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int option;

    do {
      printMenu();

      System.out.print("Choose an option: ");
      option = readOption(scanner);

      System.out.println();

      switch (option) {
        case 1 -> Jep395.execute(); // Records
        case 2 -> Jep398.execute(); // Deprecate the Applet API for Removal
        case 3 -> Jep406.execute(); // Pattern Matching for switch
        case 4 -> Jep409.execute(); // Sealed Classes
        case 5 -> Jep415.execute(); // Context-Specific Deserialization Filters
        case 0 -> System.out.println("Exiting application...");
        default -> System.out.println("Invalid option. Please choose a valid JEP.");
      }

      System.out.println();

    } while (option != 0);

    scanner.close();
  }

  private static void printMenu() {
    System.out.println("======================================");
    System.out.println(" Java 17 JEP Practical Exploration");
    System.out.println("======================================");
    System.out.println("1. JEP 395 - Records");
    System.out.println("2. JEP 398 - Deprecate the Applet API for Removal");
    System.out.println("3. JEP 406 - Pattern Matching for switch");
    System.out.println("4. JEP 409 - Sealed Classes");
    System.out.println("5. JEP 415 - Context-Specific Deserialization Filters");
    System.out.println("0. Exit");
    System.out.println("======================================");
  }

  private static int readOption(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Please enter a number: ");
      scanner.next();
    }

    return scanner.nextInt();
  }
}
