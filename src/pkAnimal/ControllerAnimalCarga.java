package pkAnimal;

import pkAnimal.Carga.Burro;
import pkAnimal.Carga.Caballo;
import pkAnimal.Carga.Cebra;

public class ControllerAnimalCarga {
    public void rancho(){
        Caballo caballo1 = new Caballo();
        Caballo caballo2 = new Caballo("Spark");
        Caballo caballo3 = new Caballo("Spirit",(short)5);

        Burro burro = new Burro("Bruno");

        Cebra cebra = new Cebra();
        Cebra cebra2 = new Cebra("Cecilia",(short)10);
        

        caballo1.relinchar();
        caballo2.galopar();
        caballo3.galopar(5);

        System.out.println("-------------- burro----");
        burro.galopar(3);
        burro.relinchar();

        System.out.println("-------------- cebra----");
        cebra2.presentarse("Cecilia", (short)10);
    }

}
