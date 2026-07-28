/*2) implementar um programa que recebe um número inteiro e depois informe: quantos divisores o número tem, se o número é par ou ímpar e se o número é primo.*/

import java.util.Scanner;

public class aula1_atividade2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("Número digitado: " + numero);

        if (numero % 2 == 0) {
        System.out.println("Par");
        } else {
        System.out.println("Ímpar");
        }

        int quantidadeDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                quantidadeDivisores++;
            }
        }
        System.out.println("Divisores: " + quantidadeDivisores);

        if (quantidadeDivisores == 2) {
        System.out.println("Primo.");
        } else {
        System.out.println("Não é primo.");
        }
    }
    }