package main.java.com;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Digite o terceiro número");
        double terceiroNumero = scanner.nextDouble();

        double tres = 3;

        System.out.println("A média é ");
        System.out.println((primeiroNumero + segundoNumero + terceiroNumero) / tres);
    }
}
