package c08_oop;

public class Abstraction {

    public static void main(String[] args) {

        // Abstracción

        // - Clase abstracta

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface
    }

    public static abstract class Animal {

        public abstract void sound();

        public void sleep () {
            System.out.println("EL animal esta durmiendo");
        }

    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep () {
            System.out.println("El perro esta durmiendo");
        }

    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Meow");
        }

    }

    // - Interface

    public interface Flying {

        void fly();

    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        public void fly() {
            System.out.println("EL pajaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman!");
        }

        @Override
        public void fly() {
            System.out.println("El murcielago vuela");
        }
    }

}
