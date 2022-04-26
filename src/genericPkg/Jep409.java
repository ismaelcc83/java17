package genericPkg;

public class Jep409 {

	public static void execute() {
		SerVivo sv = new SerVivo();
		//sv.setNombre("Generico");
		//sv.printSerVivo();
		sv = new Animal();
		sv.setNombre("Perro");
		sv.printSerVivo();
		sv = new Hongo();
		sv.setNombre("Champiñon");
		sv.printSerVivo();
	}	

}