package operadores;

public class Exemplo003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		num1 = 6;
		num2 = 6;
		
		
		System.out.println(num1); // 6
		System.out.println(num2); // 6
		
		
		// num1++; // num1 = num1 + 1;
		// ++num2; // num2 = num2 + 1;
		
		//System.out.println(num1++);
		System.out.println(num1);
		num1++;
		
		System.out.println(num1);
		//System.out.println(++num2);
		num2++;
		System.out.println(num2);
		
		System.out.println(++num1 - num2++);
		
	}

}
