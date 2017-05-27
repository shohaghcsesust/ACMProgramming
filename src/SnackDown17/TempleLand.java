package SnackDown17;

import java.util.Scanner;

class TempleLand {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] h = new int[101];
		int s = scan.nextInt();
		for (int cs = 0; cs < s; cs++) {
			int n = scan.nextInt();
			for (int j = 0; j < n; j++) {
				h[j]=scan.nextInt();
			}
			if(n%2==1){
				int k=h[n/2]-1;
				boolean isYes = true;
				int i=0;
				int j=0;
				for(i=n/2-1,j=n/2+1;i>=0 && j<n;i--,j++){
					if(h[i]==h[j] && h[i]==k){
						k--;
					}else{
						isYes=false;
						break;
					}
				}
				if(k==0 && isYes){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}else{
				System.out.println("no");
			}
		}
		scan.close();

	}

}
