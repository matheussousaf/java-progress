package br.com.matheussousa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        double n1; double n2; double n3;
        double media;

        Scanner scan = new Scanner(System.in);
        Media med = new Media();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");


        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextDouble();

        media = med.media(n1, n2, n3);

        System.out.println("A média do aluno foi: " + decimalFormat.format(media) + " e ele está " + med.verificaSituacao(media));
    }

    public double media(double n1, double n2, double n3){
        return (n1 + n2 + n3)/3;
    }

    public String verificaSituacao(double media){
        String situacao;

        if(media >= 7){
            situacao = "aprovado!";
        } else if(media <7 && media >=5){
            situacao = "em recuperação!";
        } else{
            situacao = "reprovado!";
        }
        return situacao;
    }
}
