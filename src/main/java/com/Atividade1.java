package main.java.com;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do motorista? ");
        String nome = scanner.nextLine();
        System.out.println("Qual a distancia percorrida? ");
        double distanciaPercorrida = scanner.nextDouble();
        System.out.println("Qual o tempo de viagem? ");
        double tempo = scanner.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempo;
        System.out.println("A velocidade média de " + nome + " é " + velocidadeMedia);








    }
}
