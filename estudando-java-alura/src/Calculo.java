import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba “Número positivo”, caso contrário, exiba “Número negativo”.

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        // Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
        // se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("Digite um numero: ");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int segundoNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro numero maior.");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("Segundo numero maior.");
        } else {
            System.out.println("Numero são iguais.");
        }

        // Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
        // Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na
        // opção selecionada.

        System.out.println("Digite 1 para executar AREA DO QUADRADO e 2 para AREA DO CIRCULO");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o valor do lado: ");
            double lado = scan.nextInt();
            double areaQuadrado = lado * lado;
            System.out.println("Area do quadrado: " + areaQuadrado);
        } else if (opcao == 2) {
            System.out.println("Digite o valor do raio: ");
            double raio = scan.nextInt();
            double areaCirculo = 3.14 * (raio * raio);
            System.out.println("Area do quadrado: " + areaCirculo);
        } else {
            System.out.println("Opção invalida. Reinicie o programa.");
        }
    }
}