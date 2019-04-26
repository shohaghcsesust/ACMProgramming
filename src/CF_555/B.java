package CF_555;

import java.util.Scanner;

//B. Long Number
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a = scan.next();
		int[] f = new int[10];
		for (int i = 1; i <= 9; i++) {
			f[i] = scan.nextInt();
		}
		StringBuilder res = new StringBuilder(a);
		boolean flag = true;
		int start = n + 1;
		for (int i = 0; i < n; i++) {
			int d = res.charAt(i) - '0';
			if (flag && f[d] > d) {
				if (start > i)
					start = i;
				res.setCharAt(i, (char) (f[d]+'0'));
			} else if (flag && f[d] == d) {
			} else if (start != n + 1) {
				flag = false;
				break;
			}
		}
		System.out.println(res);
		scan.close();
	}

}
