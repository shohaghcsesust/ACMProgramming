package CF_557;

import java.util.Scanner;

//A. Zoning Restrictions Again
public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		int[] height = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			height[i] = h;
		}
		for (int i = 0; i < m; i++) {
			int l = scan.nextInt();
			int r = scan.nextInt();
			int x = scan.nextInt();
			while (l <= r) {
				height[l] = Math.min(height[l], x);
				l++;
			}
		}
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += height[i] * height[i];
		}
		System.out.println(res);
		scan.close();
	}
}