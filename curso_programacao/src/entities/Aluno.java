package entities;

public class Aluno {

	public double Nota1;
	public double Nota2;
	public double Nota3;
	public String NomeAluno;
	
	public double Media() {
		return (Nota1  + Nota2 + Nota3);
	}
	
	public String toString() {
		if (Media() >= 60 ) {
			System.out.println("FINAL GRADE = " + this.Media());
		}
		else {
		return "FAILED" + System.lineSeparator() + "MISSING " + String.format("%.2f", 60 - this.Media()) + " POINTS";
		
		}
		return "PASS";
	}
}
