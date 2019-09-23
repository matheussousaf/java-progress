
public class EstruturaRotulo {
	
	public static void main(String[] args) {
	
		int[] lista = {1, 2, 3, 4, 5};
		int c = 0;
		
		infinite: while(true){
			for (int i : lista) {
				if(c == 20) break infinite;
				System.out.println("Número da lista: " + i);
				c++;
			}
		}
	}
}
