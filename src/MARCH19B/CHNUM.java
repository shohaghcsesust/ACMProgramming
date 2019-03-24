package MARCH19B;

import java.util.Scanner;

public class CHNUM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int cs = 1; cs <= t; cs++) {
			int n = scan.nextInt();
			int positiveCount = 0;
			int negativeCount = 0;
			int zeroCount = 0;
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				if (a > 0) {
					positiveCount++;
				} else if (a < 0) {
					negativeCount++;
				} else {
					zeroCount++;
				}
			}
			int smallGroupSize = Math.min(positiveCount, negativeCount);
			if (zeroCount > 0) {
				smallGroupSize = 1;
			}
			int maxGroupSize = Math.max(smallGroupSize,
					Math.max(positiveCount, negativeCount) + Math.max(zeroCount - 1, 0));
			if (smallGroupSize == 0) {
				smallGroupSize = maxGroupSize = n;
			}
			System.out.println(maxGroupSize + " " + smallGroupSize);
		}
		scan.close();
	}
}
