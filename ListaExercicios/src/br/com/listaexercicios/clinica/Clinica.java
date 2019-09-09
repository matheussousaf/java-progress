package br.com.listaexercicios.clinica;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) {

        String nome = "";
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<Paciente>();
        int aux1 = 0;
        int aux2 = 0;

        //Quantidade de pacientes
        int quantidade = 0;

        //Média de idade dos homens
        double somaIdadeHomens = 0;
        int quantidadeHomens = 0;

        //Quantidade de mulheres com a altura entre 1,60 e 1,70 e peso acima de 70kg.
        int quantidadeMulheresAlturaEPeso = 0;

        //Quantidade de pessoas com idade entre 18 e 25
        int quantidadePessoasIdade = 0;

        //Paciente mais velho
        int maiorIdade = 0;
        String pacienteMaisVelho = null;

        //Mulher mais baixa
        double menorAltura = 0;
        String mulherMaisBaixa = null;

        while(true){
            Paciente paciente = new Paciente();
            pacientes.add(paciente);

            System.out.println("Nome: ");
            nome = scanner.nextLine();
            if(nome.equals("fim")) break;
            paciente.setNome(nome);
            quantidade++;

            System.out.println("Idade: ");
            paciente.setIdade(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Sexo (M/F): ");
            paciente.setSexo(scanner.nextLine());

            System.out.println("Altura: ");
            paciente.setAltura(scanner.nextDouble());
            scanner.nextLine();

            System.out.println("Peso: ");
            paciente.setPeso(scanner.nextDouble());
            scanner.nextLine();
        }

        for (Paciente paciente: pacientes) {
            /*
            * Primeira parte, verificação para todas as pessoas
            * */

            String sexo = String.valueOf(paciente.getSexo());

            //Quantidade de pacientes

            //Idade entre 18 e 25
            if(paciente.getIdade() >= 18 && paciente.getIdade() <= 25){
                quantidadePessoasIdade++;
            }

            /*
            * Segunda parte, verificação para homens
            * */

            //Média de idade dos homens
            if(sexo.equals("M")){
                if(aux2 == 0){
                    maiorIdade = paciente.getIdade();
                    pacienteMaisVelho = paciente.getNome();
                    aux2++;
                }
                else if(paciente.getIdade() > maiorIdade){
                    maiorIdade = paciente.getIdade();
                    pacienteMaisVelho = paciente.getNome();
                }
                somaIdadeHomens += paciente.getIdade();
                quantidadeHomens++;
            }

            /*
            * Terceira parte, verificação para mulheres
            * */

            //Quantidade de mulheres baseado na altura e peso
            else if(sexo.equals("F")){
                //Mulher mais baixa
                if(aux1 == 0){
                    menorAltura = paciente.getAltura();
                    mulherMaisBaixa = paciente.getNome();
                    aux1++;
                }
                else if (paciente.getAltura() < menorAltura){
                    menorAltura = paciente.getAltura();
                    mulherMaisBaixa = paciente.getNome();
                }

                if((paciente.getAltura() >= 1.6 && paciente.getAltura() <= 1.7) && paciente.getPeso() > 70){
                    quantidadeMulheresAlturaEPeso++;
                }
            }
        }

        //Printando todos os itens
        System.out.println("Quantidade de pacientes: " + quantidade);
        System.out.println("Média de idade dos homens: " + (somaIdadeHomens / quantidadeHomens));
        System.out.println("Quantidade de mulheres(altura e peso): " + quantidadeMulheresAlturaEPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadePessoasIdade);
        System.out.println(pacienteMaisVelho + " é o paciente mais velho.");
        System.out.println(mulherMaisBaixa + " é a mulher mais baixa.");


    }
}
