package c08_oop;

public class Person {

    // Atributos
    private String name;
    private int age;
    final String id;

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
        if (age < 0) {
            System.out.println("Edad no valida");
        } else {
            this.age = age;
        }
    }

    public String getId() {
        return id;
    }

    // Constructor
    public Person(String name , int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Metodos
    public void sayHello() {
        System.out.println("Soy " + name + " y tengo " + age + " años" + " y mi id es " + id);
    }

}

