import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		String escolha = "sim";
		
		while(true){
			if(escolha.contentEquals("n�o")){
				System.out.println("Obrigado por usar o programa!");
				break;
			}
			
			System.out.println("Digite aqui a op��o que voc� deseja realizar: ");
			opcao = scan.nextInt();
			
			//Treinando switch case
			switch(opcao){
				case 1:
					System.out.println("Voc� escolheu a primeira op��o!");
					break;
				case 2:
					System.out.println("Voc� escolheu a segunda op��o!");
					break;
				case 3:
					System.out.println("Voc� escolheu a terceira op��o!");
					break;
				case 4:
					System.out.println("Voc� escolheu a quarta op��o!");
					break;
				default:
					System.out.println("Essa op��o n�o existe!");
			}
			
			System.out.println("Quer continuar? sim/n�o");
			escolha = scan.next();
		}

	}
}
