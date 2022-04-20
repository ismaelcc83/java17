package dev.eltiempovuela.java17.jeps;

// JEP 406 - Pattern Matching for switch
public class Jep406 {

  record Human(String name, int age) {}

  record Alien(String name, int age, String planet) {}

  public static void execute() {
    Human human = new Human("Isma", 39);
    Alien alien = new Alien("Wkst", 199, "2M1207 b");

    System.out.println("JEP 406 - Pattern Matching for switch");
    System.out.println("=====================================");
    System.out.println();
    System.out.println("This JEP is a preview feature in Java 17.");
    System.out.println(
        "Uncomment the switch version of checkObject() and enable preview to test it.");
    System.out.println();
    System.out.println(checkObjectWithoutPreview(human));
    System.out.println(checkObjectWithoutPreview(alien));
  }

  static String checkObjectWithoutPreview(Object object) {
    if (object instanceof Human human) {
      return "Human: " + human.name() + ", age: " + human.age();
    }

    if (object instanceof Alien alien) {
      return "Alien: " + alien.name() + ", age: " + alien.age() + ", planet: " + alien.planet();
    }

    if (object == null) {
      return "It is null";
    }

    return "It is an object";
  }
}
