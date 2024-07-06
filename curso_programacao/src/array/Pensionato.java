package array;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.printf("Quantos quartos você quer alugar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Quarto #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
