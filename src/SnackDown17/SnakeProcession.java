package SnackDown17;

import java.util.Scanner;

class SnakeProcession {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		while(R>0){
			R--;
			int L = scan.nextInt();
			String snakeLine = scan.next();
			int expect=0;
			boolean isValid = true;
			for(int i=0;i<L;i++){
				if(snakeLine.charAt(i)=='H'){
					if(expect==0){
						expect=1;
					}else {
						isValid=false;
						break;
					}
				}else if(snakeLine.charAt(i)=='T'){
					if(expect==1){
						expect=0;
					}else{
						isValid=false;
						break;
					}
				}
			}
			System.out.println((expect==0 && isValid)?"Valid":"Invalid");
		}
		scan.close();
	}
}
