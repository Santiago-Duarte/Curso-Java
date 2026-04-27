package c05_structures;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño

        System.out.println(names.size());

        // Añadir elementos
        names.add("Santiago");
        names.add("Duarte");
        names.add("Quintero");

        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos
        names.set(2, "santiago.duarteq@gmail.com");
        System.out.println(names.getLast());

        // Eliminar elementos
        names.remove(2);
        System.out.println(names.getLast());
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Santiago"));
        System.out.println(names.contains("santiago.duarteq@gmail.com"));
    }

}
