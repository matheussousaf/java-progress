package javaproject;

import java.util.Scanner;

public class AulaJava {
	public static void main(String[] args) {
		//Início primeira aula (19-08)
		System.out.println("Hello world!");
		//Fim da primeira aula
		
		//Início segunda aula (20-08)
		String nome = "Matheus de Sousa";
		int anoNascimento = 2000;
		double idade = 19;
		
		System.out.println("Seu nome é " + nome + " você nasceu em " + anoNascimento + " e tem " + idade + "anos.");
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = leitor.nextDouble();
		
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();
		
		System.out.println("Seu nome é " + nome + " você nasceu em " + anoNascimento + " e tem " + idade + "anos.");
		
		leitor.close();
		
		//Extras:
		
		AlunoNormal alunoNormal = new AlunoNormal();
		AlunoEspecial alunoEspecial = new AlunoEspecial();
		
		alunoNormal.estuda(10);
		
		alunoEspecial.falaDemais();
		
		//Fim da segunda aula
	}
}
