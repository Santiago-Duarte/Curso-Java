package c09_exceptions;

public class Exceptions {

    public static void main(String[] args) {

        // try catch
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // try con multiples catch

        // try catch
        try {
            var result = 10 / 2;
            System.out.println(result);

            var name = "Santiago";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mitico");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error no esperado");
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque try-catch ");
        }

        // Throw
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        // Exepcion personalizada
        try {
            throwExample.checkScore(45);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación " + e.getMessage());
        }

        System.out.println("Fin");

    }

}
