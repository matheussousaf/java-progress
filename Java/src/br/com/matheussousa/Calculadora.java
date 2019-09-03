package br.com.matheussousa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scan = new Scanner(System.in);
        double n1; double n2;
        String pattern = "#.##";

        DecimalFormat decimalFormat = new DecimalFormat(pattern);


        System.out.println("Digite o primero número: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scan.nextDouble();

        System.out.println("As operações com esses números são: ");
        System.out.println("Soma: " + decimalFormat.format(calc.soma(n1, n2)));
        System.out.println("Subtração: " + decimalFormat.format(calc.subtracao(n1, n2)));
        System.out.println("Divisão: " + decimalFormat.format(calc.divisao(n1, n2)));
        System.out.println("Multiplicação: " + decimalFormat.format(calc.multiplicacao(n1, n2)));
    }

    public double soma(double n1, double n2){
        return (n1 + n2);
    }

    public double subtracao(double n1, double n2){
        return (n1 - n2);
    }

    public double divisao(double n1, double n2){
        return (n1 / n2);
    }

    public double multiplicacao(double n1, double n2){
        return (n1 * n2);
    }
}
