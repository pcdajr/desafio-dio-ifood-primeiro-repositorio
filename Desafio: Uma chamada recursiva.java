// Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner numero = new Scanner(System.in);
        System.out.print(Main.somatorio(numero.nextInt()));

    }
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
