package genericPkg;

import java.io.IOException;

// Pattern Matching for switch
public class Jep406 {

    static record Human(String name, int age) {
    }

    static record Alien(String name, int age, String planet) {
    }

    public static void execute() throws IOException {

	System.out.println("Creating Human");
	Human h = new Human("Isma", 39);
	Alien a = new Alien("Wkst", 199, "2M1207 b");
	System.out.println(checkObject(h));
	System.out.println(checkObject(a));
    }

    @SuppressWarnings("preview")
    public static String checkObject(Object obj) {
	return switch (obj) {
	case Human h -> "Name: " + h.name() + ", age: " + h.age();
	case Alien a -> "Name: " + a.name() + ", age: " + a.age() + " and planet: " + a.planet;
	case null -> "It is null";
	default -> "It is an object";
	};
    }
}