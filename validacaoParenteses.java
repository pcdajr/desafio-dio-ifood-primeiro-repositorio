//Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean caracter = ValidParentheses.ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {

        char[] caracter = s.toCharArray();


        if ((caracter[0] == '(') && (caracter[1] == ')')) {
            return true;
        } else if ((caracter[0] == '[') && (caracter[1] == ']')) {
            return true;
        } else if ((caracter[0] == '{') && (caracter[1] == '}')) {
            return true;
        } else {
            return false;
        }
    }

}
