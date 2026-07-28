/*1) implementar um programa que recebe os lados de um triângulo e, se estes lados são válidos para essa figura geométrica, mostre a área do triângulo (calcular usando Teorema de Heron).*/

/* importação da classe Scanner para receber dados do usuário */
import java.util.Scanner;

/* Todo programa Java precisa de uma classe e de um main.
Criação de classe */ 
public class aula1_atividade1 {

    /* Criação do método main: onde o programa começa a executar*/
    public static void main(String[] args) {

        /* Criação de um objeto Scanner para receber dados do usuário 
        Criacão de uma variavel chamada entrada e variavel vai ler dados do terminal*/
        Scanner entrada = new Scanner(System.in);
    
        /* Criação de variáveis para armazenar os lados do triângulo 
        Double: tipo de variavel para guarda numero decimal*/
        double lado1, lado2, lado3;

        /* Solicitação ao usuário para digitar o valor do primeiro lado do triângulo */
        System.out.print("Digite o primeiro lado: ");
        lado1 = entrada.nextDouble();

        /* Solicitação ao usuário para digitar o valor do segundo lado do triângulo */
        System.out.print("Digite o segundo lado: ");
        lado2 = entrada.nextDouble();

        /* Solicitação ao usuário para digitar o valor do terceiro lado do triângulo */
        System.out.print("Digite o terceiro lado: ");
        lado3 = entrada.nextDouble();

        /* Verificação se os lados formam um triângulo válido, se sao positivos */
        if (lado1 > 0 && lado2 > 0 && lado3 > 0 &&
            lado1 + lado2 > lado3 &&
            lado1 + lado3 > lado2 &&
            lado2 + lado3 > lado1) {
        System.out.println("Forma um triângulo.");

        /* Cálculo do semiperímetro */
        double semiperimetro = (lado1 + lado2 + lado3) / 2;

        /* Cálculo da área usando o Teorema de Heron */
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("Área: " + area);

        /* Printf para caso o triangulo seja invalido */
        } else {
        System.out.println("Triângulo invalido.");
        }

        /* Fechamento do objeto Scanner para liberar recursos */
        entrada.close();
    }
}