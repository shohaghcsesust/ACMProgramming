package CF_335;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//D. Diverse Garland
public class D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('R', 0);
		mp.put('G', 1);
		mp.put('B', 2);

		int n = scan.nextInt();
		StringBuilder s = new StringBuilder(scan.next());
		int res = 0;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				res++;
				for (Character c : mp.keySet()) {
					if (s.charAt(i) != c) {
						if (i + 1 < n && c != s.charAt(i + 1)) {
							s.setCharAt(i, c);
							break;
						} else if (i == n - 1) {
							s.setCharAt(i, c);
							break;
						}
					}
				}
			}
		}
		System.out.println(res + "\n" + s);
		scan.close();
	}
}
