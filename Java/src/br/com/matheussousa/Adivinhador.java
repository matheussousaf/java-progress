package br.com.matheussousa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Adivinhador {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        int anoNascimento;
        String dataNascimento = "10/10/10";
        Adivinhador adivinhador = new Adivinhador();
        
        System.out.println("Digite o ano do seu nascimento: ");
        anoNascimento = scan.nextInt();

        System.out.println("Você tem " + (adivinhador.anoAtual(anoNascimento)) + " anos!");

    }

    public int anoAtual(int anoNascimento){
        int ano = 2019 - anoNascimento;
        return ano;
    }
}
