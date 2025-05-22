package main.java.com;

import java.util.Scanner;

public class ObjetoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        double primeiroNumero = scanner.nextDouble();

        System.out.printf("Digite o segundo número");
        double segundoNumero = scanner.nextDouble();

        System.out.printf("O resultado da multiplicação é ");
        System.out.println(primeiroNumero * segundoNumero);
    }
}
