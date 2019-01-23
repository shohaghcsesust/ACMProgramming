package CF_534;

import java.util.Scanner;

//C. Grid game
public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// first two vertical then horizontal
		int[] r = new int[] { 1, 3, 4, 4 };
		int[] c = new int[] { 4, 4, 1, 3 };
		String s = scan.next();
		int v = 0;
		int h = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				v = (v + 1) % 2;
				if (v == 1) {
					System.out.println(r[0] + " " + c[0]);
				} else {
					System.out.println(r[1] + " " + c[1]);
				}
			} else {
				h = (h + 1) % 2;
				if (h == 1) {
					System.out.println(r[2] + " " + c[2]);
				} else {
					System.out.println(r[3] + " " + c[3]);
				}
			}
		}
		scan.close();
	}
}
