package estudandostring_arrays;

public class Estudo_array {

	public static void main(String[] args) {

		int[] nota = new int[3];
		//int[] nota = {9,10,8};
		
		nota [0] = 9;
		nota [1] = 10;
		nota [2] = 9;
		
		/*
		System.out.println(nota[0]);
		System.out.println(nota[1]);
		System.out.println(nota[2]);
		*/
		
		
		for(int i=0;i<3;i++) {
			System.out.println(nota[i]);
		}
		
		
		/*
		for(int valor:nota) {
			System.out.println(valor);
		}
		*/
		
	}

}
