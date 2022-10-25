//Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'. Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. 
//Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.

import java.util.Scanner;  // Import the Scanner class
import java.util.*;

public class Main {  
  public static void main(String args[]) { 
    Scanner myObj = new Scanner(System.in); 
    int entrada = myObj.nextInt(); 

    if(entrada==1 || entrada==0){
      System.out.println(entrada);
    }else{
      String[] arrayOperadores = {"x","/","+","-"};
      int posOperadorMom = 0;
      ArrayList listaValores = new ArrayList();
      String equacao = "";
  
      for(int i=entrada; i >= 1 ; i--){
        listaValores.add(i);
        equacao = equacao + String.valueOf(i) + arrayOperadores[posOperadorMom];
        if(posOperadorMom==3){
          posOperadorMom = 0;
        }else{
          posOperadorMom +=1;
        }
      }
      //System.out.println(equacao);
  
  
      posOperadorMom =0;
      int posListaVal = 0;
      int posListaValProx = 1;
      int posListaValProxProx = 2;
      int tamListaValores = entrada;
      int terminou = 0; //terminou 1. nao terminou 0
      ArrayList listaResulMultEDiv = new ArrayList();
      ArrayList valoresSomaOuSub = new ArrayList();
      
  
      while (terminou!=1) {
        int valorAtual = (int) listaValores.get(posListaVal);
        
        if(posOperadorMom == 0){              //multiplicacao e divisao aq mesmo acontece
          if(posListaVal==tamListaValores-1){
              if(posListaVal>3){
                valoresSomaOuSub.add(-valorAtual);
              }else{
                valoresSomaOuSub.add(valorAtual);   
              }
              terminou=1;
            break;
          }
          int valorProx = (int) listaValores.get(posListaValProx);
          int valorResulM = valorAtual * valorProx;
          int valorResulDiv = valorResulM ;
          
          //System.out.println(valorResulDiv) ;
          
          if(posListaValProx==tamListaValores-1){
              if(posListaVal>3){
                valoresSomaOuSub.add(-valorResulDiv);
              }else{
                valoresSomaOuSub.add(valorResulDiv);   
              }
              terminou=1;
            break;
          }
          
          if(posListaValProxProx<tamListaValores){
            int valorProxProx = (int) listaValores.get(posListaValProxProx);
            //System.out.println(valorProxProx);
            valorResulDiv = (int) valorResulM/valorProxProx;
          }
  
          //System.out.println(valorResulDiv) ;
          if(posListaVal>3){
              valoresSomaOuSub.add(-valorResulDiv);
          }else{
              valoresSomaOuSub.add(valorResulDiv);   
          }
          if(posListaValProxProx==tamListaValores-1){
            terminou=1;
            break;
          }
          
          posListaVal +=3;
          posListaValProx +=3;
          posListaValProxProx +=3;
          posOperadorMom =2;
        }
        else if(posOperadorMom == 2){          // operador soma
            //System.out.println(valorAtual);
            valoresSomaOuSub.add(valorAtual);
            if((posListaVal)==tamListaValores-1){
              terminou=1;
            }
            posListaVal +=1;
            posListaValProx +=1;
            posListaValProxProx +=1;
            posOperadorMom =0;
        }else{
            //nada
        }
        
      }
  
      int valorSoma = 0;
  
      for(int x=0; x < valoresSomaOuSub.size(); x++){
          int valorA = (int) valoresSomaOuSub.get(x);
          //System.out.println(valorA);
          valorSoma += valorA;
      }
      System.out.println(valorSoma);
      
      
    } 
  }
   
  
}
