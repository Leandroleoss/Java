package curso_programacao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca;
		
		diferenca = ((a*b) - (c*d));
		System.out.printf("DIFERENCA = %d",diferenca);
		
		sc.close();
	}

}
