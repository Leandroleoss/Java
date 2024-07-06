package estrutura_condicional;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double cachorro = 4.0;
		double xsalada = 4.5;
		double xbacon = 5.0;
		double torrada = 2;
		double refri = 1.50;
		double resultado = 0;
		
		int codigo = sc.nextInt();
		double quantidade = sc.nextDouble();
		
		
		if (codigo == 1) {
			resultado = quantidade * cachorro;
			
		}
		else if (codigo == 2) {
			resultado = quantidade * xsalada;
		}
		else if (codigo == 3) {
			resultado = quantidade * xbacon;
		}
		else if (codigo == 4) {
			resultado = quantidade * torrada;
		}
		else if (codigo == 5) {
			resultado = quantidade * refri;
		}
		System.out.printf("Total: R$: %.2f%n", resultado);
		
		sc.close();

	}

}
