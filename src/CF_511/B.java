package CF_511;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long ans = 0;
		for(int i=0;i<n;i++){
			long x = scan.nextLong();
			long y = scan.nextLong();
			ans = Math.max(ans, x+y);
		}
		System.out.println(ans);
		scan.close();
	}

}
