//Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

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
