package entities;

public class funcionario {

	public String name;
	public double GrossSalary;
	public double Tax;
	public double IncreaseSalary;

	
	public double NetSalary() {
		return GrossSalary - Tax;

	}

	public String toString() {
		return "Employee: " + String.format("%.2f", name) + ", $" + String.format("%.2f", NetSalary());
	}

	//função para calcular a porcentagem
	public double percentage() {
		IncreaseSalary *= GrossSalary / 100;
		return IncreaseSalary += GrossSalary;
	}
}
