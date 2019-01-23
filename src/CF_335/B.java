package CF_335;

import java.util.Arrays;
import java.util.Scanner;

//B. Divisors of Two Integers
public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] d = new int[n];
		boolean[] f = new boolean[10005];
		boolean[] f2 = new boolean[n];
		for (int i = 0; i < n; i++) {
			d[i] = scan.nextInt();
		}
		Arrays.sort(d);
		int x = d[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			if (x % d[i] == 0 && !f[d[i]]) {
				f[d[i]] = true;
				f2[i] = true;
			}
		}
		int y = d[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			if (!f2[i]) {
				y = d[i];
				break;
			}
		}
		System.out.println(x + " " + y);
		scan.close();
	}
}
