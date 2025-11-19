package pkAnimal.Carga;

public class Cebra extends Cuadrupedo {

    public Cebra() {
        System.out.println("No se definio nada para la cebra...");
    }

    public Cebra(String nombre, short edad) {
        this.edad = edad;
        this.nombre = nombre;
        
    }

    public void presentarse(String nombre, short edad) {
        System.out.println("Soy la cebra" + nombre + " y tengo " + edad + " años");
    }

}
