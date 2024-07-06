package orientada_a_objeto;

import java.util.Scanner;
import entities.exe1;

public class retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		exe1 exe1 = new exe1();
		System.out.println("Enter rectangle width and height:");
		exe1.width = sc.nextDouble();
		exe1.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , exe1.area());
		System.out.printf("PERIMETER = %.2f%n" , exe1.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" , exe1.diagonal());
		
		sc.close();

	}

}
