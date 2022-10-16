//Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N, resultado = 0;

        Scanner leitor = new Scanner(System.in);
            A = leitor.nextInt();
            N = leitor.nextInt();

        for(int i=A;i<=N;i+=A){
            resultado = resultado + i;
        }
        System.out.println(resultado);
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}
