package c07_functions;

import java.util.ArrayList;

public class FunctionExercises {
    public static void main(String[] args) {
        bienvenida();
        saludo("Santiago");
        resta(8 , 3);
        cuadrado(4);
        esPar(8);
        System.out.println(esMayorDeEdad(23));

        var lista = new ArrayList<String>();
        lista.add("Brais");
        lista.add("Moure");
        System.out.println(longitudCadena(lista));

        var listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(4);
        listaNumeros.add(7);
        listaNumeros.add(16);
        System.out.println(calcularMedia(listaNumeros));

        System.out.println(calcularFactorial(8));

        recorrerArray(lista);
    }

    public static void bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde 0!");
    }

    public static void saludo(String name) {
        System.out.println("Hola " + name + "!");
    }

    public static void resta(int num1 , int num2) {
        System.out.println(num1 - num2);
    }

    public static void cuadrado(int num) {
        System.out.println(num * num);
    }

    public static void esPar(int num) {
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
    }

    public static boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public static int longitudCadena(ArrayList<String> lista) {
        return lista.size();
    }

    public static double calcularMedia(ArrayList<Integer> lista) {
        int sumador = 0;
        for (int num : lista) {
            sumador += num;
        }
        return (double) sumador / lista.size();
    }

    public static int calcularFactorial(int num) {
        int numero = 1;
        for (int i = 1; i <= num; i++) {
            numero *= i;
        }
        return numero;
    }

    public static void recorrerArray(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }
}
