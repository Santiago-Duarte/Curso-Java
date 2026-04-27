package c05_structures;

import java.util.HashMap;
import java.util.HashSet;

public class Maps {

    public static void main(String[] args) {

        // Declaracion y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //Tamaño

        System.out.println(names.size());

        //Añadir elementos
        names.put("Santiago", "santiago@gmail.com");
        names.put("Duarte", "duarte@gmail.com");
        names.put("Quintero", "quintero@gmail.com");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos
        System.out.println(names.get("Santiago"));

        // Verificar elementos
        System.out.println(names.containsKey("Santiago"));
        System.out.println(names.containsValue("santiago@gmail.com"));

        // Eliminar elementos
        names.remove("Quintero");
        System.out.println(names.remove("Duarte"));
        System.out.println(names);

        // Modificacion de elementos
        names.replace("Santiago", "santiago.duarteq@gmail.com"); // Reemplaza el valor solo si ya existe
        System.out.println(names);

        names.putIfAbsent("Duarte", "duarte@gmail.com"); // Añade el valor solo si no existe
        System.out.println(names);

        // Limpiar HashMap
        names.clear();
        System.out.println(names);


    }
}
