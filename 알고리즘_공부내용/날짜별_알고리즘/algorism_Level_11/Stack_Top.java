package algorism_Level_11;

import java.util.Scanner;
import java.util.Stack;

//ž
public class Stack_Top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int scale = in.nextInt();

		int[] arr = new int[scale + 5];

		int[] answer = new int[scale + 5];

		for (int i = 0; i < scale; i++) {
			arr[i] = in.nextInt();
		}

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		System.out.print(stack.peek() + " ");
		for (int i = 1; i < scale; i++) {

			if (arr[stack.peek()] > arr[i]) {
				System.out.print(stack.peek() + 1 + " ");
				stack.push(i);
			} else {

				stack.pop();
				if (stack.empty() == true) {
					System.out.print(0 + " ");
					stack.push(i);
				} else {
					i--;
				}
			}

		}

	}

}