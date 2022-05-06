package genericPkg;

public class Jep409 {

    public static void execute() {
	SerVivo sv = new SerVivo();
	sv = new Animal();
	sv.setNombre("Pantera");
	sv.printSerVivo();
	sv = new Hongo();
	sv.setNombre("Champiñon");
	sv.printSerVivo();
    }

}