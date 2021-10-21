package algorism_Level_11;

import java.util.Scanner;
import java.util.Stack;

//스택 구현하기
public class Stack_StackImplement {

	static Scanner in = new Scanner(System.in);
	static Stack stack = new Stack<>();

	static int size = in.nextInt();

	static int count = in.nextInt();

	static int[][] arr = new int[1005][5];
	static int[] result = new int[105];
	static int len = 0;

	public static void push(int x) {
		if (size <= len) {
			System.out.println("Overflow");
		} else {
			result[len] = x;
			len++;
		}
	}

	public static void pop() {
		if (len <= 0) {
			System.out.println("Underflow");
		} else {
			result[len - 1] = 0;
			len--;
		}
	}

	public static void top() {
		if (len <= 0) {
			System.out.println("NULL");
		} else {
			System.out.println(result[len - 1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < count; i++) {
			arr[i][0] = in.nextInt();

			if (arr[i][0] == 1) {
				arr[i][1] = in.nextInt();
			}

		}

		for (int i = 0; i < count; i++) {
			if (arr[i][0] == 1) {
				push(arr[i][1]);
			} else if (arr[i][0] == 2) {
				pop();
			} else {
				top();
			}
		}
	}

}