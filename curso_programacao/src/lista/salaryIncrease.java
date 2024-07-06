package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class salaryIncrease {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Quantos funcionários você quer registrar? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.println("Esse id já está cadastrado, tente outro: ");
				id = sc.nextInt();
			}
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salário: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println();
		System.out.println("Entre com o id do funcionário que você quer alterar o salário :");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("Esse id não existe!");
		} else {
			System.out.println("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaSalary(percent);
		}

		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
