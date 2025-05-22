package main.java.com;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Digite o primeiro numero");
        int primeiroNumero = scanner.nextInt();

        System.out.println( " Digite o segundo numero");
        int segundoNumero = scanner.nextInt();

        int div = primeiroNumero/segundoNumero;
        System.out.println(" O quociente é ");
        System.out.println(div);

        int resto = primeiroNumero % segundoNumero;
        System.out.println(" O resto é ");
        System.out.println(resto);




    }
}
