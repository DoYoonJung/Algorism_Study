package algorism_Level_11;

import java.util.Scanner;
import java.util.Stack;

//°ýÈ£
public class Stack_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack stack = new Stack<>();
		String answer = in.next();
		String[] arr = new String[answer.length() + 2];

		for (int i = 0; i < answer.length(); i++) {

			arr[i] = answer.substring(i, i + 1);
		}

		int cnt = 0;
		for (int i = 0; i < answer.length(); i++) {
			if (stack.empty() == true && arr[i].equals(")")) {
				cnt = 1;
				break;
			}

			if (arr[i].equals("(")) {
				stack.push("(");
			} else if (arr[i].equals(")")) {
				stack.pop();
			}

		}

		if (stack.empty() == true && cnt == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
