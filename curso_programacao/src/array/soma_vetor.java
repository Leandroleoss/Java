package array;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int qtNum = sc.nextInt();
		double vet [] = new double[qtNum]; //criando o vetort
		
			for(int i = 0; i < qtNum; i++) { //atribuindo valores ao vetor
				System.out.printf("Digite um número: ");
				vet[i] = sc.nextDouble();
			}
		
			//imprimir todos os valores do vetor com o loop foreach
			System.out.printf("\nVALORES: ");
			
			double soma = 0;
			double media = 0;
			for (double j : vet) {
				System.out.printf(j + " "); //imprimindo na mesma linha
				soma += j;
				media = soma / qtNum;
			}
			
			System.out.printf("\nSOMA = %.2f%n" , soma);
			System.out.printf("MEDIA = %.2f%n" , media);
		sc.close();
	}

}
