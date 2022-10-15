//Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 

//Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 

//Logo, NÃO é um Palíndromo. 

import java.util.EventListener;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.next();
        char[] arrayLetras = palavra.toCharArray();
        String palindroma = "";

        for (int i = 0; i <(arrayLetras.length); i++) {

            char letraFinal = arrayLetras[palavra.length() - (i + 1)];
            palindroma += letraFinal;

        }

        if (palindroma.equals(palavra)) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");

        }
    }
}
