//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
package curso_programacao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário: ");
		int num = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora:");
		double recebehora = sc.nextDouble();
		
		double salario;
		
		salario = horas * recebehora;
		System.out.printf("NUMBER = %d%n", num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
