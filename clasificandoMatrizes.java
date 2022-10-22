//Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] entrada = new int[N];

        ArrayList lista = new ArrayList();

        for (int i = 0; i < N; i++) {
            entrada[i] = input.nextInt();
            if (entrada[i] % 2 == 0) lista.add(entrada[i]);
        }

        for (int elemento : entrada) {
            if (elemento % 2 != 0){
              lista.add(elemento);
            }
          
        }
        
        if ((N%2 != 0) && (N>1)){
          Collections.swap(lista, (N-2), (N-1));
        }
        
        
        for (int i = 0; i < N ; i++) {
            System.out.println(lista.get(i));
            
        }

    }
}
