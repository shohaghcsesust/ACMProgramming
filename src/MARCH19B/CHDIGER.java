package MARCH19B;

import java.util.Scanner;

public class CHDIGER {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int cs = 1; cs <= t; cs++) {
			String n = scan.next();
			int d = scan.nextInt();
			String res = "";
			String back = "";
			for (char c : n.toCharArray()) {
				if (c - '0' >= d) {
					back += d;
				} else {
					res += c;
				}
			}
			boolean flag = false;
			while (!flag) {
				flag = true;
				for (int i = 0; i < res.length(); i++) {
					// check after remove ith digit
					String aftrRemove = res.substring(0, i) + res.substring(i + 1);
//					System.out.println(aftrRemove + back + d + ":" + res + back);
					if ((aftrRemove + back + d).compareTo(res + back) < 0) {
						res = aftrRemove;
						back += d;
						flag = false;
						break;
					}
				}
			}
			res += back;
			System.out.println(res);
		}
		scan.close();
	}
}
