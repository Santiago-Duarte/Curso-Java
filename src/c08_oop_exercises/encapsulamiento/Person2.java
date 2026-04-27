package c08_oop_exercises.encapsulamiento;

public class Person2 {

    // Atributos
    private String name;
    private int age;

    // Constructor

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}