package curso_programacao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//função para entrada de dados usuário
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores inteiros.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma;
		
		soma = x+y;
		
		
		System.out.printf("SOMA = %d", soma);
		
		sc.close();

	}

}
