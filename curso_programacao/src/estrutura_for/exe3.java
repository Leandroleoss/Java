package estrutura_for;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qt = sc.nextInt();
		
		double x  = 0;
		double y = 0;
		double z = 0;
		double media = 0;
		
		for (int i = 0; i < qt; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			media = ((x *= 2) + (y *= 3) + (z *= 5)) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		
		
		sc.close();

	}

}
