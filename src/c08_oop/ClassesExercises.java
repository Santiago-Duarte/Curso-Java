package c08_oop;

import c08_oop_exercises.encapsulamiento.Book;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // Crear un libro
        var book = new Book("Atomic Habits" , "James Clear");
        book.MostrarDatos();



        // Crear varias personas
        var person1 = new Person("Santiago" , 17 , "123456789A");
        var person2 = new Person("Yaira" , 44 , "987654321B");
        var person3 = new Person("Rene" , 49 , "456789123C");
        var person4 = new Person("Taliana" , 12 , "123456789D");

        var listaPersonas = new ArrayList<Person>();
        listaPersonas.add(person1);
        listaPersonas.add(person2);
        listaPersonas.add(person3);
        listaPersonas.add(person4);

        for (Person persona : listaPersonas) {
            System.out.println(persona.getName()+ " " + persona.getAge() + " años");
        }


    }

}
