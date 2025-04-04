package map;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
    public static void main(String[] args) {
        Map<Integer, String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1, "Carla");
        mapaEmpleados.put(2, "Juan");
        mapaEmpleados.put(3, "Pedro");

        // Saber si hay un valor en concreto,  el método containsValue devuelve un boolean
        System.out.println("Está el valor 'Juan'?? " + (mapaEmpleados.containsValue("Juan") ? "Si está." : "No está."));

        // Buscar por la clave
        System.out.println("Está la key '2'?? " + (mapaEmpleados.containsKey(2) ? "Si está." : "no está."));

        // Obtener todos los valores
        System.out.println("Los valores son: " + mapaEmpleados.values());

        // Obtener todas las claves
        System.out.println("Las claves son: " + mapaEmpleados.keySet());

        // Obtener un valor por su clave
        System.out.println("El empleado num 2 es: " + mapaEmpleados.get(2));

        // Método remove
        mapaEmpleados.remove(2);
        System.out.println("Se ha eliminado al empleado 2 \n" + mapaEmpleados);
    }
}
