package array;

import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] vect = new String[] { "Maria", "João", "Pedro" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("------------------------");

		for (String nomes : vect) {
			System.out.println(nomes);
		}
		sc.close();

	}

}
