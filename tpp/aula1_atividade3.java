/*3) implementar um programa que recebe dois números inteiros e depois informe se eles são primos relativos.*/

import java.util.Scanner;

public class aula1_atividade3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();
        System.out.println("Números digitados: " + num1 + " e " + num2);
        int mdc = 1;
        for (int i = 2; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mdc = i;
            }
        }
        System.out.println("MDC: " + mdc);
        if (mdc == 1) {
            System.out.println("São primos relativos.");
        } else {
            System.out.println("Não são primos relativos.");
        }   
        entrada.close();
    }
}