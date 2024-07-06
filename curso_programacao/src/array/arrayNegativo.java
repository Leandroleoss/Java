package array;

import java.util.Locale;
import java.util.Scanner;

public class arrayNegativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int vet[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um número: ");
			vet[i] = sc.nextInt();
		}

		System.out.println("NUMERO NEGATIVOS: ");

		for (int j = 0; j < n; j++) {
			if (vet[j] < 0) {
				System.out.println(vet[j]);
			}
		}
		sc.close();
	}

}
