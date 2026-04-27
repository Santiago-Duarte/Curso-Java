package c08_oop_exercises.encapsulamiento;

public class Student {

    // Atributos
    int score;

    // Metodos
    public void estaAprobado() {
        if (score >= 5) {
            System.out.println("El estudiante esta aprobado");
        } else {
            System.out.println("El estudiante no esta aprobado");
        }
    }
}
