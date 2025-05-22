package main.java.com;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite o nome do produto ");
        String nome = scanner.nextLine();
        System.out.println(" Preço da compra");
        double precoCompra = scanner.nextDouble();
        System.out.println(" Preço da venda");
        double precoVenda = scanner.nextDouble();

        double lucro = precoVenda - precoCompra;
        System.out.println(" O lucro de " + nome);
        System.out.println(lucro);

    }
}
