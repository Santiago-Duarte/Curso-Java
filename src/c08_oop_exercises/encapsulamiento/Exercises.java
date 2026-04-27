package c08_oop_exercises.encapsulamiento;

public class Exercises {
    public static void main(String[] args) {

        // Ejercicio 1
        // Crear un objeto de la clase Person
        Person2 person2 = new Person2("Santiago", 17);
        person2.setAge(18);
        System.out.println(person2.getAge());
        System.out.println(person2.getName());
        person2.setName("Pedro");
        System.out.println(person2.getName());


        // Crear un perro
        var dog = new Dog();
        dog.sonido = "Guau";
        dog.bark();

        // Crear un estudiante
        var student = new Student();
        student.score = 4;
        student.estaAprobado();

        // Crear una cuenta bancaria
        var bankAccount = new BankAccount();
        bankAccount.balance = 1000;
        bankAccount.deposit(500);
        System.out.println("El saldo de la cuenta es: " + bankAccount.balance);
    }
}
