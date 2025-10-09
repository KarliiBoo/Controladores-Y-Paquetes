package pkAnimal.Carga;

    public class Burro extends Cuadrupedo{


    public Burro(){
        System.out.println("No se definio nada para el Burro...");
    }
    /**
     * Constructor crea un Burro con nombre
     * @param n :nombre del Burro
     */
    public Burro(String n){
        this.nombre = n;
    }
    
    public Burro(String nombre,Short edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Metodo relinchar que indica el <b>sonido del Burro<b/>
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
        System.out.println("El burro "  + this.nombre + " va a galopar por la pradera...");

        for(int i = 0; i < tiempo; i++) {
            System.out.println("Galopando..."+ i);

        }
        }

        public void galopar(){
            System.out.println("Soy un burro " + nombre.toUpperCase() + " sin rienda...");
        }
}

