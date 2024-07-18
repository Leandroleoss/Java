package lista;

import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 2 números para configurar o tamanho da matriz: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int posicao = 0;

		int[][] matriz = new int[n][m];

		System.out.println("Agora digite os dados da matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Sua matriz é: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Qual número você deseja saber informaçoes sobre a posição?");
		posicao = sc.nextInt();
		
		for ( int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == posicao) {
					System.out.println("Posição: " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + matriz[i -1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direta: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Em baixo: " + matriz[i+1][j]);
					}
				
				}
			}
		}
		
		sc.close();

	}

}