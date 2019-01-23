package CF_335;

import java.util.Scanner;

//C. Nice Garland
public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] pattern = new String[] { "RGB", "RBG", "GBR", "GRB", "BRG", "BGR" };
		int[] recoloredLamps = new int[] { 0, 0, 0, 0, 0, 0 };
		int n = scan.nextInt();
		String s = scan.next();
		for (int i = 0; i < n;) {
			int left = i;
			int right = Math.min(i + 3, n);
			int len = right - left;
			for (int j = 0; j < 6; j++) {
				int it = left;
				for (int k = 0; k < len; k++, it++) {
					if (pattern[j].charAt(k) != s.charAt(it)) {
						recoloredLamps[j]++;
					}
				}
			}
			i += len;
		}
		int res = recoloredLamps[0];
		int p = 0;
		for (int i = 1; i < 6; i++) {
			if (recoloredLamps[i] < res) {
				res = recoloredLamps[i];
				p = i;
			}
		}
		System.out.println(res);
		StringBuilder resStr = new StringBuilder("");
		int div = n / 3;
		for (int i = 0; i < div; i++) {
			resStr.append(pattern[p]);
		}
		if (n % 3 > 0) {
			resStr.append(pattern[p].substring(0, Math.min(3, n % 3)));
		}

		System.out.println(resStr);
		scan.close();
	}

}
