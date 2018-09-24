package CF_511;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 1;
		int b = (n-1)/2;
		int c = n - (a+b);
		if(b%3==0){
			b--;
			a++;
		}
		if(c%3==0){
			b--;
			c++;
		}
		System.out.println(a+" "+b+" "+c);
		scan.close();
	}
}
