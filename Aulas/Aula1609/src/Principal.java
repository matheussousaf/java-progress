import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		String escolha = "sim";
		
		while(true){
			if(escolha.contentEquals("não")){
				System.out.println("Obrigado por usar o programa!");
				break;
			}
			
			System.out.println("Digite aqui a opção que você deseja realizar: ");
			opcao = scan.nextInt();
			
			//Treinando switch case
			switch(opcao){
				case 1:
					System.out.println("Você escolheu a primeira opção!");
					break;
				case 2:
					System.out.println("Você escolheu a segunda opção!");
					break;
				case 3:
					System.out.println("Você escolheu a terceira opção!");
					break;
				case 4:
					System.out.println("Você escolheu a quarta opção!");
					break;
				default:
					System.out.println("Essa opção não existe!");
			}
			
			System.out.println("Quer continuar? sim/não");
			escolha = scan.next();
		}

	}
}
