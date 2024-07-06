package estruturawhile;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (x < 1 || x > 4) {
			x = sc.nextInt();
			
			if(x ==1 ) {
				a+=1;
				x = 0;
			}
			else if (x == 2) {
				b+=1;
				x = 0;
			}
			else if (x == 3) {
				c+=1;
				x = 0;
			}
			
		}
		
		switch (x) {
			case 4:
			break;
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: "+ b);
		System.out.println("Diesel: " + c);
		
		sc.close();

	}

}
