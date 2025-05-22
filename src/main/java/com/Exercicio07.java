package main.java.com;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite o primeiro numero ");
        int primeiroNumero = scanner.nextInt();

        System.out.println(" Digite o segundo numero ");
        int segundoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        double divisao = primeiroNumero / (double)segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;

        System.out.println(" A soma dos numeros é " + soma + " A subtração dos numeros é " + subtracao +
                " A divisão dos numeros é " + divisao + " A multiplicação dos numeros é " + multiplicacao);






    }
}
