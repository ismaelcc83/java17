package dev.eltiempovuela.java17.jeps;

public class Jep409 {

  public static void execute() {
    SerVivo planta = new Planta("Rosa");
    SerVivo animal = new Perro("Toby");

    planta.print();
    animal.print();
  }

  private static sealed class SerVivo permits Planta, Animal {

    private final String nombre;

    private SerVivo(String nombre) {
      this.nombre = nombre;
    }

    private void print() {
      System.out.println(nombre + " is a " + getClass().getSimpleName());
    }
  }

  private static final class Planta extends SerVivo {

    private Planta(String nombre) {
      super(nombre);
    }
  }

  private static non-sealed class Animal extends SerVivo {

    private Animal(String nombre) {
      super(nombre);
    }
  }

  private static final class Perro extends Animal {

    private Perro(String nombre) {
      super(nombre);
    }
  }
}
