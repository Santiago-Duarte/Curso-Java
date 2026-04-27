package c08_oop;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Santiago" , 17, "123456789A");
        person.sayHello();

        person.setAge(18);
        System.out.println(person.getAge());
    }

}
