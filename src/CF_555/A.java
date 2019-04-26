package CF_555;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//A. Reachable Numbers
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = countDifferentNumber(n);
		System.out.println(res);
		scan.close();
	}

	public static int countDifferentNumber(int n) {
		Map<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
		while (!mp.containsKey(n)) {
			mp.put(n, true);
			n++;
			while (n % 10 == 0) {
				n /= 10;
			}
//			System.out.println(n);
		}
		return mp.size();
	}

}
