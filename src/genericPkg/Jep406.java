package genericPkg;

import java.io.IOException;

public class Jep406 {

	static record Human (String name, int age, String profession) {}
	static record Alien (String name, int age, String planet) {}

	public static void execute() throws IOException {
		 
		 System.out.println("Creating Human");
		 Human h = new Human("Ismael",39,"Ingeniero");
		 Alien a = new Alien("Azulino",199,"Urano");
		 System.out.println(checkObject(h));
		 System.out.println(checkObject(a));
	 }
	
	@SuppressWarnings("preview")
	public static String checkObject(Object obj) {
	    return switch (obj) {
	        case Human h -> "Name: "+h.name()+", age: "+h.age()+" and profession: " +h.profession;
	        case Alien a -> "Name: "+a.name()+", age: "+a.age()+" and planet: " +a.planet;
	        case null -> "It is null";
	        default -> "It is an object";
	    };
	}
}