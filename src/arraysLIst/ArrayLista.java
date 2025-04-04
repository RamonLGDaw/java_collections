package arraysLIst;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {

    public static void main(String[] args) {
        List<Persona> miLista = new ArrayList<Persona>();

        miLista.add(new Persona(1,"Carla",44));
        miLista.add(new Persona(2,"Maria",40));
        miLista.add(new Persona(3,"Pedro",41));
        miLista.add(new Persona(4,"Juan",66));

        for(Persona item: miLista){
            System.out.println("Nombre: " + item.getNombre());
        }

        for(int i = 0; i < miLista.size(); i++){
            System.out.println("Edad: " + miLista.get(i).getEdad());
        }


        //  Remove en arrayList
        miLista.remove(3);

        System.out.println("Se ha removido el índice 3");

        for(int i = 0; i < miLista.size(); i++){
            System.out.println("Edad: " + miLista.get(i).getNombre());
        }


        // Método size()
        System.out.println("Cantidad de elementos de miLista = " + miLista.size());

         // Método isEmpty, devuelve true o false
         System.out.println("\nmiLista esta vacía?? " + miLista.isEmpty());

         // Método clear
         miLista.clear();
 
         System.out.println("\n" + //
                         "Después de aplicar el método clear()...\n" + //
                                                         "");
         System.out.println("miLista esta vacía?? " + miLista.isEmpty());
    }

}
