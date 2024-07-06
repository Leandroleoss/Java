package orientada_a_objeto;

import java.util.Scanner;
import entities.CompraDolar;

public class conversao_dolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CompraDolar CompraDolar = new CompraDolar();

		System.out.print("Whats is the dollar price? ");
		CompraDolar.Reais = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CompraDolar.Dolar = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = " + CompraDolar.CurrencyConverter());

		sc.close();
	}

}
