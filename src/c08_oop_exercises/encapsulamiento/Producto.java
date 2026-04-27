package c08_oop_exercises.encapsulamiento;

public class Producto {

    // Atributos
    private int price;

    // Constructor
    public Producto(int price) {
        this.setPrice(price);
    }

    // Metodos
    public void setPrice(int price) {
        if (price >= 0 ) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }
}
