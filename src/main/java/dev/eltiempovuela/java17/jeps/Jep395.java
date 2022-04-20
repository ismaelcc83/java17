package dev.eltiempovuela.java17.jeps;

// JEP 395 - Records
public class Jep395 {

  public static User createUser(String name, String email) {
    return new User(name, email);
  }

  public static void execute() {
    User user = createUser("Ismael", "ismael@eltiempovuela.dev");
    User sameUser = createUser("Ismael", "ismael@eltiempovuela.dev");

    System.out.println("JEP 395 - Records");
    System.out.println("=================");
    System.out.println();
    System.out.println(user);
    System.out.println("Name: " + user.name());
    System.out.println("Email: " + user.email());
    System.out.println("Are both users equal? " + user.equals(sameUser));
  }

  record User(String name, String email) {}
}
