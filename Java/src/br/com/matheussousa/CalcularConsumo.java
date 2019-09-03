package br.com.matheussousa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularConsumo {
    public static void main(String[] args) {
        double combustivelGasto; double distanciaPercorrida;
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        CalcularConsumo calc = new CalcularConsumo();


        System.out.println("Digite a quantidade de combustível gasto (L): ");
        combustivelGasto = scan.nextDouble();

        System.out.println("Digite a distância percorrida em (km)");
        distanciaPercorrida = scan.nextDouble();

        System.out.println("O consumo médio do carro é de: " + decimalFormat.format(calc.calcularConsumoMedio(distanciaPercorrida, combustivelGasto)) + " km/L");
    }

    public double calcularConsumoMedio(double dist, double combus){
        return dist/combus;
    }
}
