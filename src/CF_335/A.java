package CF_335;

import java.util.Scanner;

//A. Two distinct points
public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int l1 = scan.nextInt();
			int r1 = scan.nextInt();
			int l2 = scan.nextInt();
			int r2 = scan.nextInt();
			System.out.println((l1!=r2)?(l1+" "+r2):(r1+" "+l2));
		}
		scan.close();
	}

}
