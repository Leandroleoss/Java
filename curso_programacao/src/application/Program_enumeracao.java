package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program_enumeracao {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do Departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Entre com a data de trabalho");
		System.out.print("Nome :");
		String WorkerName = sc.nextLine();
		System.out.print("Nível: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salário Base: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(WorkerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.println("Quantos contratos esse trabalhador tem? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com o contrato#" + i + " data:");
			System.out.print("Date (DD/MM/YYYY: ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valeuPerHour = sc.nextDouble();
			System.out.println("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valeuPerHour, hours);
			worker.addContract(contract);
		}

		sc.close();

	}

}
