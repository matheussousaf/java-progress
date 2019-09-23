
public class EstruturasDeRepetição {
	
			
	public static void main(String[] args) {
		
		int[] lista = {4, 5, 6, 7, 8};
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		for(int z: lista){
			System.out.println("O número escrito foi: " + z);
		}
	}
}
