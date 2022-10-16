//Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. 
//Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.

import java.util.*;

public class BuscaSequencial{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        BuscaSequencial.buscarElementos(num);

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }
    public static void buscarElementos(int num){

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for (int i=0; i < (elementos.length);i++){

            if (elementos[i] == num){
                System.out.println("Achei "+num+" na posicao "+i);
                break;
            }else if(elementos.length == (i+1)){
                System.out.println("Numero "+num+" nao encontrado!");
            }

        }

    }

}

