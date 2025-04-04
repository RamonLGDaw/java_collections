package linkedList;

import arraysLIst.Persona;
import java.util.LinkedList;
import java.util.List;

public class LinkedListas {

    public static void main(String[] args) {
        List<Persona> miLista = new LinkedList<Persona>();

        // Agregar elementos al final de la lista.
        miLista.add(new Persona(1,"Carla",44));
        miLista.add(new Persona(2,"Maria",40));
        miLista.add(new Persona(3,"Pedro",41));
        miLista.add(new Persona(4,"Juan",66));

        //Agregar elementos al principio de la lista añadiendo el índice en el primer argumento.
        miLista.add(0, new Persona(5, "Raquel", 36));

        System.out.println("LinkedList completa: ");
        for(Persona item : miLista){
            System.out.println("Nombre: " + item.getNombre());
        }

        // Remove en linkedList
        System.out.println("\nLinkedlist sin el elemento 'Raquel'\n");
        String nombreBorrar = "Raquel";

        for(Persona item : miLista){
            if(item.getNombre().equals(nombreBorrar)){
                miLista.remove(item);
                break; // Sin el break da el error: java.util.ConcurrentModificationException
            }
        }

        // Comprovación de la eliminación de 'Xati'
        for(Persona item : miLista){
            System.out.println("Nombre: " + item.getNombre());
        }

        // Método size()
        System.out.println("Cantidad de elementos de miLista = " + miLista.size());

        // Método getFirst y getLast
        System.out.println("Primer elemento de miLista = " + miLista.getFirst() + "\nÚltimo elemento de miLista = " + miLista.getLast());


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
