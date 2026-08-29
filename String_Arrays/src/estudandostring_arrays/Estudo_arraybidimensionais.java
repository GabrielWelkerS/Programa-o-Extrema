package estudandostring_arrays;

public class Estudo_arraybidimensionais {

	public static void main(String[] args) {

		//int [][] matriz = new int [2][3];
	
		//int g, w;
		
		//int matriz [][],g,w;
		//matriz = new int[2][3];
		
		int g,w;
		int matriz[][]= {{0,1,2},{3,4,5}};
		
		/*
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		*/
		
		//System.out.println(matriz [0][0]);
		//System.out.println(matriz [1][2]);
		
		for(g=0;g<2;g++) {
			for(w=0;w<3;w++) {
				System.out.println(matriz [g][w]);
			}
		}
		
	}

}
