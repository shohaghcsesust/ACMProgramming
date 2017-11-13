package NOV17;

import java.util.Scanner;

public class PERPALIN {
	private static int n,p;
    private static String pal;
    private static String a,b;
    private static void genAB(){
        a="";
        for(int i=0;i<50000;i++){
            a+='a';
        }
        b="bb";
    }
    static {
        genAB();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int cs=1;cs<=t;cs++){
            n = scan.nextInt();
            p = scan.nextInt();
            pal="";
            if(isPossible()){
                calPal();
                p=pal.length();
                for(int i=0;i<n/p;i++){
                    System.out.print(pal);
                }
                System.out.println();
            } else {
                System.out.println("impossible");
            }
            pal=null;
        }
        scan.close();
    }
    private static boolean isPossible(){
        if(p<=2) return false;
        if(n%p!=0) return false;
        if(n==p){
            return true;
        }
        return true;
    }
 
    private static void calPal(){
        if(p%2==0){
            p-=2;
            p/=2;
            pal=a.substring(0,p)+b.substring(0,2)+a.substring(0,p);
        } else {
            p/=2;
            pal=a.substring(0,p)+b.substring(0,1)+a.substring(0,p);
        }
    }
}
