package c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud
        var valores = new int[5];
        System.out.println(valores.length);

        System.out.println(valores[2]);
        valores[2] = 10;
        System.out.println(valores[2]);

        var valores2 = new ArrayList<Integer>();
        valores2.add(1);
        valores2.add(2);
        valores2.add(3);
        valores2.add(4);
        valores2.remove(2);
        System.out.println(valores2);

        var valores3 = new HashSet<String>();
        valores3.add("Santiago");
        valores3.add("Duarte");
        valores3.add("Quintero");
        valores3.add("Santiago");
        System.out.println(valores3);
        valores3.remove("Santiago");
        System.out.println(valores3);

        var valores4 = new HashMap<String , Long>();
        valores4.put("Santiago" , 3224512607L);
        valores4.put("Duarte" , 3824312107L);
        valores4.put("Quintero" , 3624522647L);
        System.out.println(valores4);

        valores4.replace("Duarte" , 3183531682L);
        System.out.println(valores4);

        valores4.remove("Quintero");

        String[] valores5 = new String[5];
        valores5[1] = "UFPSO";
        valores5[2] = "UFSCAR";
        valores5[3] = "UFABC";
        valores5[4] = "UFAM";
        valores5[0] = "UFABC";

        var lista_universidades = new ArrayList<>(Arrays.asList(valores5));
        System.out.println(lista_universidades);

        var universidades = new HashSet<>(lista_universidades);
        System.out.println(universidades);

        var map_universidades = new HashMap<String , Integer>();
        int i = 1;
        for (String elemento : universidades) {
            map_universidades.put(elemento , i);
            i++;
        }
        System.out.println(map_universidades);

    }
}
