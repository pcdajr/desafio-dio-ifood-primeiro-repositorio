//Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, 
//é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

import java.util.*;
//TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

public class Main {

    public static void main(String args[]) {

        int entrada = Integer.parseInt(new Scanner(System.in).nextLine());

        //casos bases que diminuem o custo
        if(Main.raizEhInteira(entrada)){
            System.out.println(1);
        }else if(Main.raizEhInteira(entrada - 1)){
            System.out.println(2);
        }else if(Main.raizEhInteira(entrada - 2)){
            System.out.println(3);
        }else if(Main.raizEhInteira(entrada - 4)){
            System.out.println(2);
        }else if(Main.raizEhInteira(entrada - 5)){
            System.out.println(3);
        }else{
            ArrayList<Integer> listaIntervalos = listaNoIntervalo(entrada);
            int tamLista = (int) listaIntervalos.size();
            int ultimoQuadPerf = (int) listaIntervalos.get(tamLista-1);
            int resto = entrada-ultimoQuadPerf;
            if(Main.raizEhInteira(resto)){
                System.out.println("2");
            }else{
                //casos mais custosos
                Main.calcularComb(listaIntervalos, tamLista, entrada);
            }

        }

    }
    public static boolean raizEhInteira(int numero){
        Double raizQuadradEmDouble = Math.sqrt(numero);
        int raizQuadradEmInt = (int) Math.sqrt(numero);
        if(raizQuadradEmDouble > raizQuadradEmInt){ //numero nao inteiro
            return false;
        }else{  //numero inteiro exato
            return true;
        }
    }
    public static ArrayList<Integer> listaNoIntervalo(int entrada){
        ArrayList<Integer> listaIntervalos = new ArrayList();

        int valorTab = 1;
        while(true){
            int numeroperf = valorTab * valorTab;
            if(numeroperf<=entrada){
                listaIntervalos.add(numeroperf);
            }else{
                break;
            }
            valorTab += 1;
        }
        //Main.printarItensIntervalo(listaIntervalos);
        return listaIntervalos;

    }
    public static void printarItensIntervalo (ArrayList<Integer> listap){
        for(int x=0; x < listap.size(); x++){
            int valorA = (int) listap.get(x);
            System.out.println(valorA);
        }
    }
    public static void calcularComb(ArrayList<Integer> listaquadperfnoint, int tamLista, int valorentrada){

        int retornoResultadoFinal = valorentrada; //pior caso juncoes de 1

        for (int i = tamLista-1; i >= 0; i--) {

            int varAux = valorentrada;
            int numCombinacoes = 0;

            for (int x = i; x >= 0; x--) {
                while((varAux - listaquadperfnoint.get(x)) >= 0){
                    varAux -= listaquadperfnoint.get(x);
                    numCombinacoes ++;
                }
            }
            if (numCombinacoes < retornoResultadoFinal){ retornoResultadoFinal = numCombinacoes;
            };
        }
        System.out.println(retornoResultadoFinal);
    }

}
