package orientada_a_objeto;

import java.util.Scanner;
import entities.Aluno;

public class exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno Aluno = new Aluno();
		
		System.out.println("Name: ");
		Aluno.NomeAluno = sc.nextLine();
		Aluno.Nota1 = sc.nextDouble();
		Aluno.Nota2 = sc.nextDouble();
		Aluno.Nota3 = sc.nextDouble();
		
		System.out.println(Aluno.toString());
		
		sc.close();

	}

}
