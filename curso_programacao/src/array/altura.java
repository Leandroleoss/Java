package array;

import java.util.Locale;
import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = 0;
		double somaAltura = 0;
		int contadorMenores16 = 0;

		System.out.println("Quantas pessoas serão digitadas? ");
		num = sc.nextInt();

		String[] nome = new String[num];
		int idade[] = new int[num];
		double altura[] = new double[num];

		// armazenar os dados nos vetores
		for (int i = 0; i < num; i++) {
			System.out.printf("Dados da %da pessoa ", i + 1);
			System.out.printf("\nNome: ");
			nome[i] = sc.next();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			System.out.printf("Altura: ");
			altura[i] = sc.nextDouble();

		}

		for (int j = 0; j < num; j++) {
			if (idade[j] < 16) {
				contadorMenores16++;
			}
			somaAltura += altura[j];
		}
		double mediaAltura = somaAltura / num;
		double porcentagemMenoresDe16 = (double) contadorMenores16 / num * 100;
		System.out.printf("\nAltura média: %.2f%n", mediaAltura);
		System.out.printf("\nPessoas com menos de 16 anos: %.2f%%", porcentagemMenoresDe16);
		sc.close();

	}

}
