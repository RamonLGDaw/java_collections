package stack_pilas;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> miPila = new Stack<Integer>();

        System.out.println("Pila vacía: " + miPila);
        System.out.println("La pila está vacía?? " + miPila.isEmpty());

        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        miPila.push(4);
        miPila.push(5);
        miPila.push(6);

        System.out.println("Pila llena: " + miPila);
        System.out.println("La pila está vacía?? " + miPila.isEmpty());


        // Recorrer la pila.
        for(Integer item : miPila ){
            System.out.println("Item: "+item);
        }

        // Eliminar el último registro que entró.
        miPila.pop();
        System.out.println("Se ha eliminado el último registro que entro: " + miPila);

        // Buscar un elemento en concreto.
        System.out.println("Está el 3?? Si devuelve un num positivo es true y un num negativo es false " + miPila.search(3));

        // Saber que elemento está el último en la pila.
        System.out.println("Último elemento agregado: " + miPila.peek());
        
    }
}
