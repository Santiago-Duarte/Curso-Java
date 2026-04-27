package c05_structures;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Santiago");
        names.add("Duarte");
        names.add("Quintero");

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Acceder a los elementos
        System.out.println(names.size());
        System.out.println(names);

        // Eliminar elementos
        names.remove("Quintero");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Santiago"));
        System.out.println(names.contains("duarte"));

        System.out.println(names);
        names.add("Santiago");
        names.add("Santiago");
        names.add("Santiago");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("Colombia");
        countries.add("España");
        countries.add("EEUU");
        countries.add("Santiago");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);
    }
}
