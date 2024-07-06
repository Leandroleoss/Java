package estrutura_for;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x < 0 || x > 1000) {
			System.out.println("Digite um valor entre 1 e 1000");
			x = sc.nextInt();
		}
			for(int i = 1; i <= x; i++) {
				
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
			sc.close();
	}

}
