package main.java.com;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Digite a base do triangulo ");
        double base = scanner.nextDouble();
        System.out.println(" Digite a altura do triangulo");
        double altura = scanner.nextDouble();
        double area = ((base * altura) /2);
        System.out.println(" A área do triângulo é ");
        System.out.println(area);
    }
}
