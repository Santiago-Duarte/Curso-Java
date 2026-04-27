package c03_strings;

public class Strings {

    static void main(String[] args) {

        // Cadenas de texto

        String name = "Santiago";
        var surname = new String("Duarte");

        // Operaciones básicas

        System.out.println(name + " " + surname);

        System.out.println(name.length());

        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1));

        // Obtener subcadena
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Santiago"));
        System.out.println("Hola, Java".contains("ava"));

        // Comparacion
        System.out.println(name == ("Santiago"));
        System.out.println(name.equals("santiago"));
        System.out.println(name.equalsIgnoreCase("santiago"));

        // == vs equals

        var a = "Quintero";
        var b = "Quintero";
        var c = new String("Quintero");

        System.out.println(a == b);
        System.out.println(a == c);



        // Trim
        System.out.println(" Hola , me llamo Santiago ".trim());


        // Replace
        System.out.println(" Hola , me llamo Santiago ".replace("Santiago", "Duarte"));

        // format
        var age = 17;
        System.out.println(String.format("Hola, %s. Tengo %d años" , name , age));
    }

}



