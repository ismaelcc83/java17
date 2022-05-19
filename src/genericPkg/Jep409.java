package genericPkg;

import java.util.ArrayList;
import java.util.List;

public class Jep409 {
    private SerVivo sv;

    // clase anidada
    private sealed class SerVivo permits Monera, Protoctista, Hongo, Planta, Animal {

	protected String nombre;
	protected NucleoCelula nucleoCelula;
	protected List<TipoCelula> tipoCelula;
	protected List<Nutricion> nutricion;
	protected List<Reproduccion> reproduccion;

	enum NucleoCelula {
	    PROCARIOTA, EUCARIOTA
	}

	enum TipoCelula {
	    UNICELULAR, PLURICELULAR
	}

	enum Nutricion {
	    AUTOTROFA, HETEROTROFA
	}

	enum Reproduccion {
	    ASEXUAL, SEXUAL
	}

	SerVivo() {
	    tipoCelula = new ArrayList<>();
	    nutricion = new ArrayList<>();
	    reproduccion = new ArrayList<>();
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public void printSerVivo() {
	    System.out.println("Nombre: " + nombre);
	    System.out.println("===============");
	    System.out.println("Características: ");
	    System.out.println("Nucleo Celula -> " + nucleoCelula);
	    System.out.print("Tipo Celula -> ");
	    tipoCelula.forEach(result -> System.out.print(result + " "));
	    System.out.println("");
	    System.out.print("Nutricion -> ");
	    nutricion.forEach(result -> System.out.print(result + " "));
	    System.out.println("");
	    System.out.print("Reproduccion -> ");
	    reproduccion.forEach(result -> System.out.print(result + " "));
	    System.out.println("");
	    System.out.println("===============");
	    System.out.println("");
	}
    }

    private final class Monera extends SerVivo {
	Monera() {
	    nucleoCelula = NucleoCelula.PROCARIOTA;
	    tipoCelula.add(TipoCelula.UNICELULAR);
	    nutricion.add(Nutricion.AUTOTROFA);
	    nutricion.add(Nutricion.HETEROTROFA);
	    reproduccion.add(Reproduccion.ASEXUAL);
	}
    }

    private final class Protoctista extends SerVivo {
	Protoctista() {
	    nucleoCelula = NucleoCelula.EUCARIOTA;
	    tipoCelula.add(TipoCelula.UNICELULAR);
	    nutricion.add(Nutricion.AUTOTROFA);
	    nutricion.add(Nutricion.HETEROTROFA);
	    reproduccion.add(Reproduccion.ASEXUAL);
	}
    }

    private final class Hongo extends SerVivo {
	Hongo() {
	    nucleoCelula = NucleoCelula.EUCARIOTA;
	    tipoCelula.add(TipoCelula.UNICELULAR);
	    tipoCelula.add(TipoCelula.PLURICELULAR);
	    nutricion.add(Nutricion.HETEROTROFA);
	    reproduccion.add(Reproduccion.ASEXUAL);
	    reproduccion.add(Reproduccion.SEXUAL);
	}
    }

    private final class Planta extends SerVivo {
	Planta() {
	    nucleoCelula = NucleoCelula.EUCARIOTA;
	    tipoCelula.add(TipoCelula.PLURICELULAR);
	    nutricion.add(Nutricion.AUTOTROFA);
	    reproduccion.add(Reproduccion.ASEXUAL);
	    reproduccion.add(Reproduccion.SEXUAL);
	}
    }

    private non-sealed class Animal extends SerVivo {
	Animal() {
	    nucleoCelula = NucleoCelula.EUCARIOTA;
	    tipoCelula.add(TipoCelula.PLURICELULAR);
	    nutricion.add(Nutricion.HETEROTROFA);
	    reproduccion.add(Reproduccion.SEXUAL);
	}
    }

    public Jep409() {
	sv = new SerVivo();
    }

    public void create() {
	sv = new SerVivo();
	sv = new Animal();
	sv.setNombre("Pantera");
	sv.printSerVivo();
	sv = new Hongo();
	sv.setNombre("Champiñon");
	sv.printSerVivo();
    }

    public static void execute() {
	Jep409 jep = new Jep409();
	jep.create();
    }
}