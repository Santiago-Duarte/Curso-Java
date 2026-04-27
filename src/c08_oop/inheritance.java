package c08_oop;

public class inheritance {

    public static void main(String[] args) {

        //Herencia
        var animal = new Animal("Lion");
        animal.eat();

        var dog = new Dog("Tiger" , 7);
        dog.eat();

        var cat = new Cat("Whiskers");
        cat.eat();

        var bird = new Bird("Tweety");
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        final String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name , int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat(){
            System.out.println("El perro con nombre " + this.name + " esta comiendo");
        }

    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("Esta volando");
        }
    }
}
