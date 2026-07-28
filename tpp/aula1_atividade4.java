/*4) implementar um programa que recebe um vetor de números double e depois retorna a média destes números, qual é o maior número, qual é o menor número, qual é o desvio padrão e qual é o desvio médio.*/

import java.util.Scanner;

public class aula1_atividade4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int quantidade = entrada.nextInt();
        double[] numeros = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
        System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }
        System.out.println("Números digitados: " + java.util.Arrays.toString(numeros));
        double soma = 0;
        double maior = numeros[0];
        double menor = numeros[0];
        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        double media = soma / quantidade;
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        double somaDesvio = 0;
        for (int i = 0; i < quantidade; i++) {
            somaDesvio += Math.pow(numeros[i] - media, 2); 
        }
        double desvioPadrao = Math.sqrt(somaDesvio / quantidade);
        double desvioMedio = 0;
        for (int i = 0; i < quantidade; i++) {
            desvioMedio += Math.abs(numeros[i] - media);
        }
        desvioMedio /= quantidade;
        System.out.println("Desvio Padrão: " + desvioPadrao);
        System.out.println("Desvio Médio: " + desvioMedio);
    }
}