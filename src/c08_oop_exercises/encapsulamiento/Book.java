package c08_oop_exercises.encapsulamiento;

public class Book {
    // Atributos
    String title;
    String author;

    // Constructos
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Metodo
    public void MostrarDatos() {
        System.out.println("El libro se llama " + title + " y el autor es " + author + ".");
    }

}
