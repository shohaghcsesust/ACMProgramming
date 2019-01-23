package CF_534;

import java.util.Scanner;
import java.util.Stack;

//B. Game with string
public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] res = new String[] { "No", "Yes" };
		Stack<Character> stack = new Stack<Character>();
		int step = 0;
		String str = scan.next();
		for (char c : str.toCharArray()) {
			if (!stack.isEmpty() && stack.peek().equals(c)) {
				stack.pop();
				step++;
			} else {
				stack.add(c);
			}
		}
		System.out.println(res[step % 2]);
		scan.close();
	}

}
