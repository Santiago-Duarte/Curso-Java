package c05_structures;

public class Array {

    public static void main(String[] args) {

        // Declaración y creación
        int[] numbers = new int[3];
        System.out.println(numbers.length);

        String [] names = {"Santiago" , "Duarte" , "Quintero"};
        System.out.println(names);

        // Acceso
        System.out.println(numbers[0]);
        System.out.println(names[0]);

        // Modificación
        names[0] = "Taliana";
        System.out.println(names[0]);

        // numbers[3] = 4

        System.out.println((new String[3])[0]);

        names[2] = null;
        System.out.println(names[2]);
    }

}
