package algorism_Level_11;

import java.util.Scanner;
import java.util.Stack;

//°ýÈ£ÀÇ °ª
public class Stack_ValueOfParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String answer = in.next();
		Stack stack = new Stack<>();
		int mul = 1;
		int result = 0;

		char[] arr = new char[answer.length() + 2];
		for (int i = 0; i < answer.length(); i++) {
			arr[i] = answer.charAt(i);
		}

		for (int i = 0; i < answer.length(); i++) {

			if (arr[i] == '(') {
				mul = mul * 2;
				stack.push('(');
			} else if (arr[i] == '[') {
				mul = mul * 3;
				stack.push('[');
			} else if (arr[i] == ')') {
				if (stack.empty() == true || (char) stack.peek() != '(') {
					result = 0;
					break;
				}
				stack.pop();
				if (answer.charAt(i - 1) == '(') {

					result += mul;

				}
				mul = mul / 2;
			} else if (arr[i] == ']') {
				if (stack.empty() == true || (char) stack.peek() != '[') {
					result = 0;
					break;
				}
				stack.pop();
				if (answer.charAt(i - 1) == '[') {

					result += mul;

				}
				mul = mul / 3;
			}

		}
		if (stack.empty() == true) {
			System.out.println(result);

		} else {
			System.out.println(0);
		}

	}
}