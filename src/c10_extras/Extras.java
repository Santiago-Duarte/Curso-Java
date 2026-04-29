package c10_extras;

import c08_oop.Classes;
// import c08_oop.*;
import c08_oop.Person;

import java.util.Scanner;

public class Extras {

    static String globalName = "Santiago";

    public static void main(String[] args) {
        // Extras

        // null

        String name = "Santiago";
        name = null;
        if (name != null) {
            System.out.println(name);
        } else {
            System.out.println("Name is null");
        }

        // import

        new Person("Santiago", 17 , "1092");
        new Classes();

        // Scanner

        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");

        var age = scanner.nextInt();
        System.out.println("La edad es: " + age);

        // Scope
    }

    public static void test () {
        System.out.println(globalName);
    }

}
