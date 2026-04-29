package c08_oop;

public class Polymorphism {

    public static void main(String[] args) {

        // Polimorfismo


        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        var calculator = new Calculator();
        System.out.println(calculator.sum(3, 2));
        System.out.println(calculator.sum(5 , 6.6));
    }

    // Polimorfismo por herencia (sobrescritura)

    public static class Animal {

        public void sound() {
            System.out.println("Algun sonido");
        }

    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

    }

    // - Polimorfismo por sobrecarga (Sobrecarga de métodos)

    public static class Calculator {

        public int sum(int a , int b) {
            return a + b;
        }

        public double sum(double a , double b) {
            return a + b;
        }

    }

}
