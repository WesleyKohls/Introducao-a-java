package main.java.com.estruturacomdicional;

import java.util.Scanner;

public class Atividade02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero + " É um número par");
        }else {
            System.out.println(numero + " É um número impar");
        }


    }
}
