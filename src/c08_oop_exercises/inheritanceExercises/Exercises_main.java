package c08_oop_exercises.inheritanceExercises;

import java.util.ArrayList;

public class Exercises_main {

    public static void main(String[] args) {

        var car = new Car();
        car.move();
        car.honk();


        var student = new Student("John", 30);
        student.grade();
        student.study();


        var dog = new Dog("Tiger");
        dog.sonido();

        var cat = new Cat("Whiskers");
        cat.sonido();

        var bird = new Bird("Tweety");
        bird.sonido();


        var manager = new Manager("John", 30, "IT");
        System.out.println("El gerente " + manager.name + " tiene un salario de " + manager.salary + " y gestiona el departamento de " + manager.departamento);

        // Ejercicio 5
        var listaAnimales = new ArrayList<Animal2>();
        listaAnimales.add(dog);
        listaAnimales.add(cat);
        listaAnimales.add(bird);

        for (Animal2 animal : listaAnimales) {
            animal.sonido();
        }

    }

    // Ejercicio 1
    public static class Vehicle {

        public void move() {
            System.out.println("El vehiculo se mueve");
        }

    }

    public static class Car extends Vehicle {
        public void honk() {
            System.out.println("El vehiculo ha tocado la bocina");
        }
    }


    // Ejercicio 2
    public static class Person3 {
        String name;
        int age;

        public Person3(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Student extends Person3 {

        public Student(String name, int age) {
            super(name, age);
        }

        public void grade() {
            System.out.println("El estudiante esta ha obtenido una nota");
        }

        public void study() {
            System.out.println("El estudiante esta estudiando");
        }
    }


    // Ejercicio 3
    public static class Animal2 {
        String name;

        public Animal2(String name) {
            this.name = name;
        }

        public void sonido() {
            System.out.println("El animal hace un sonido");
        }
    }

    public static class Dog extends Animal2 {

        public Dog(String name) {
            super(name);
        }

        @Override
        public void sonido() {
            System.out.println("El perro hace woff");
        }
    }

    public static class Cat extends Animal2 {

        public Cat(String name) {
            super(name);
        }

        @Override
        public void sonido() {
            System.out.println("El gato hace miau");
        }
    }

    public static class Bird extends Animal2 {
        public Bird(String name) {
            super(name);
        }

        @Override
        public void sonido() {
            System.out.println("El ave hace chirp");
        }
    }


    // Ejercicio 4
    public static class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {

        String departamento;

        public Manager(String name, int salary, String departamento) {
            super(name, salary);
            this.departamento = departamento;
        }

    }




}
