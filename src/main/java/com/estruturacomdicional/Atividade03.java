package main.java.com.estruturacomdicional;

import java.util.Scanner;

public class Atividade03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite um número ");
        int numero = scanner.nextInt();

        if (numero > 0 ){
            System.out.println(numero + " É um numero positivo");
        }else {
            System.out.println((numero * -1) + " É um numero negativo ");
        }





    }
}
