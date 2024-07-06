package curso_programacao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double area;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		System.out.printf("AREA: %.4f%n",area);
		
		sc.close();
	}

}
