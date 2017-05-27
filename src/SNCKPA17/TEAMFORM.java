package SNCKPA17;

import java.util.Scanner;

class TEAMFORM {
	static String[] res={"yes","no"};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t,n,m,u,v;
		t=scan.nextInt();
		for (int cs = 0; cs < t; cs++) {
			n=scan.nextInt();
			m=scan.nextInt();
			for (int i = 0; i < m; i++) {
				u=scan.nextInt();
				v=scan.nextInt();
			}
			n-=2*m;
			System.out.println(res[n%2]);
		}
		scan.close();
	}

}
