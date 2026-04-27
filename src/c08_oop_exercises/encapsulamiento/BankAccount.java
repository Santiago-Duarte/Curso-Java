package c08_oop_exercises.encapsulamiento;

public class BankAccount {

    // Atributos
    double balance;

    // Metodo
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("No hay suficiente dinero en la cuenta");
        }
    }

    public double getBalance() {
        return balance;
    }

}
