package CF_555;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int res = 0;
		StringBuilder path = new StringBuilder();
		int last = -1;
		for (int i = 0, j = n - 1; i <= j;) {
			if (i == j) {
				if (last == -1 || last < a[i]) {
					last = a[i];
					path.append('L');
					res++;
					i++;
				} else {
					break;
				}
			} else if (a[i] < a[j]) {
				if (last == -1 || last < a[i]) {
					last = a[i];
					path.append('L');
					res++;
					i++;
				} else {
					if (last < a[j]) {
						last = a[j];
						path.append('R');
						res++;
						j--;
					} else {
						break;
					}
				}
			} else if (a[j] < a[i]) {
				if (last == -1 || last < a[j]) {
					last = a[j];
					path.append('R');
					res++;
					j--;
				} else {
					if (last < a[i]) {
						last = a[i];
						path.append('L');
						res++;
						i++;
					} else {
						break;
					}
				}
			} else {
				// go to left
				StringBuilder leftPath = new StringBuilder();
				int leftLast = last;
				int l = i;
				int r = j;
				while (l <= r) {
					if (leftLast == -1 || leftLast < a[l]) {
						leftLast = a[l];
						leftPath.append('L');
						l++;
					} else {
						break;
					}
				}

				// go to right
				StringBuilder rightPath = new StringBuilder();
				int rightLast = last;
				l = i;
				r = j;
				while (l <= r) {
					if (rightLast == -1 || rightLast < a[r]) {
						rightLast = a[r];
						rightPath.append('R');
						r--;
					} else {
						break;
					}
				}
				if (leftPath.length() >= rightPath.length()) {
					path.append(leftPath);
					res += leftPath.length();
				} else {
					path.append(rightPath);
					res += rightPath.length();
				}
				break;
			}
		}
		System.out.println(res + "\n" + path);
		scan.close();
	}

}
