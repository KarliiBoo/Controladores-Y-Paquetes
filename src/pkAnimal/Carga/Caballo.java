package pkAnimal.Carga;

public class Caballo extends Cuadrupedo {

    public Caballo(){
        System.out.println("No se definio nada para el caballo...");
    }
    /**
     * Constructor crea un caballo con nombre
     * @param n :nombre del caballo
     */
    public Caballo(String n){
        this.nombre = n;
    }
    
    public Caballo(String nombre,Short edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Metodo relinchar que indica el <b>sonido del caballo<b/>
     */
    public Boolean relinchar(){
        System.out.println("Hiiiiijjjiiiiij");
        return true;
        
    }

    /**
     * Metodo que permite que el caballo corra en la predera 
     * @param tiempo
     */
    public void galopar(int tiempo){
        System.out.println("El caballo "  + this.nombre + " va a galopar por la pradera...");

        for(int i = 0; i < tiempo; i++) {
            System.out.println("Galopando..."+ i);

        }
        }

        public void galopar(){
            System.out.println("Soy un caballo " + nombre.toUpperCase() + " sin rienda...");
        }
}

