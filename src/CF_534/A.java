package CF_534;

import java.util.Scanner;

//A. Splitting into digits

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(1);
		}
		scan.close();
	}

}
