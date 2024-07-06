package estrutura_for;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
			for (int i = 0; i < N; i++) {
				double p1 = sc.nextDouble();
				double p2 = sc.nextDouble();
					
				if (p2 == 0) {
					System.out.println("Divisão impossível:");
				}
				else {
					System.out.println(p1 /= p2);
				}
			}
		
		sc.close();

	}

}
