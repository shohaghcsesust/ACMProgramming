package CF_536;

import java.util.Arrays;
import java.util.Scanner;

//C. Lunar New Year and Number Division
public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		long res = 0;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			res += (a[i] + a[j]) * (a[i] + a[j]);
		}
		System.out.println(res);
		scan.close();
	}

}
