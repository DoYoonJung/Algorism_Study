package algorism_Level_11;

import java.util.Scanner;
import java.util.Stack;

//Á¢½Ã
public class Stack_Plate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack stack = new Stack<>();
		String abcd = in.next();
		int size = abcd.length();

		char[] one = new char[size + 5];
		char[] two = new char[size + 5];

		for (int i = 0; i < size; i++) {
			one[i] = ' ';
		}
		String[] result = new String[10000];

		int count = 0;
		int resultCount = 0;
		for (int i = 0; i < size; i++) {
			one[i] = (char) ('a' + i);

		}
		for (int i = 0; i < size; i++) {
			two[i] = abcd.charAt(i);

		}
		int k = 0;

		int push = 0;
		int pop = 0;
		while (k < size + 1) {

			if (stack.empty() == false && (char) stack.peek() == two[count]) {
				stack.pop();
				result[resultCount] = "pop";
				resultCount++;
				count++;
				pop++;
			} else {
				if (one[k] == ' ') {
					break;
				} else {
					stack.push(one[k]);
					result[resultCount] = "push";
					resultCount++;
					k++;
					push++;
				}

			}

		}

		if (push - 1 == pop) {
			for (int i = 0; i < resultCount - 1; i++) {
				System.out.println(result[i]);
			}
		} else {
			System.out.println("impossible");
		}

	}

}
