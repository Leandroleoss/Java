package estrutura_for;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < x; i++) {
			int N = sc.nextInt();
			if(N >= 10 && N <= 20) {
				in++;
			}
			else {
				out ++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
