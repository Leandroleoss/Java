package orientada_a_objeto;

import entities.funcionario;
import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		funcionario funcionario = new funcionario();
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.Tax = sc.nextDouble();

		System.out.println(funcionario.NetSalary());

		System.out.print("Which percentage to increase salary? ");
		funcionario.IncreaseSalary = sc.nextDouble();

		System.out.println(funcionario.percentage());

		sc.close();

	}

}
