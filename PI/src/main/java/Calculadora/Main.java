package Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Para aceitar ponto como separador decimal
        Calculadora calculadora = new Calculadora();

        boolean continuar;

        do {
            System.out.println("Digite o primeiro valor:");
            double valorUm = scanner.nextDouble();

            System.out.println("Digite a operação (+, -, *, /):");
            String operacao = scanner.next();

            System.out.println("Digite o segundo valor:");
            double valorDois = scanner.nextDouble();

            try {
                double resultado = realizarCalculo(calculadora, valorUm, valorDois, operacao);
                System.out.println("Resultado: " + resultado);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            continuar = verificarNovaOperacao(scanner);
        } while (continuar);

        System.out.println("Calculadora encerrada.");
    }

    public static double realizarCalculo(Calculadora calculadora, double a, double b, String operacao) {
        return switch (operacao) {
            case "+" -> calculadora.somar(a, b);
            case "-" -> calculadora.subtrair(a, b);
            case "*" -> calculadora.multiplicar(a, b);
            case "/" -> calculadora.dividir(a, b);
            default -> throw new IllegalArgumentException("Operação inválida!");
        };
    }

    public static boolean verificarNovaOperacao(Scanner scanner) {
        System.out.println("Deseja realizar nova operação? (S ou N):");
        String resposta = scanner.next().toUpperCase();
        return !resposta.equals("N");
    }
} 