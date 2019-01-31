package CF_536;

import java.util.Scanner;

//A. Lunar New Year and Cross Counting
public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] M = new String[n];
		for (int i = 0; i < n; i++) {
			M[i] = scan.next();
		}
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > 0 && j > 0 && i + 1 < n && j + 1 < n && M[i].charAt(j) == 'X') {
					if (M[i - 1].charAt(j - 1) == 'X' && M[i - 1].charAt(j + 1) == 'X' && M[i + 1].charAt(j - 1) == 'X'
							&& M[i + 1].charAt(j + 1) == 'X') {
						k++;
					}
				}
			}
		}
		System.out.println(k);
		scan.close();
	}

}
