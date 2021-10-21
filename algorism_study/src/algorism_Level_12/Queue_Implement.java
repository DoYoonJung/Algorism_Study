package algorism_Level_12;

import java.util.Scanner;

//큐 구현하기
public class Queue_Implement {

	static Scanner in = new Scanner(System.in);

	static int scale = in.nextInt();
	static int count = in.nextInt();
	static int[] arr = new int[105];

	static int[][] arr1 = new int[1005][4];
	static int capacity = scale;
	static int f = 0;
	static int r = 0;

	public static void poll(int y) {
		if (r >= capacity) {
			System.out.println("Overflow");
		} else {
			arr[r++] = y;
		}
	}

	public static void pop() {
		if (arr[f] == 0) {
			System.out.println("Underflow");
		} else {
			arr[f] = 0;
			f++;
		}
	}

	public static void front() {
		if (arr[f] == 0) {
			System.out.println("NULL");
		} else {
			System.out.println(arr[f]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < count; i++) {
			arr1[i][0] = in.nextInt();
			if (arr1[i][0] == 1) {
				arr1[i][1] = in.nextInt();
			}
		}

		for (int i = 0; i < count; i++) {
			if (arr1[i][0] == 1) {
				poll(arr1[i][1]);
			} else if (arr1[i][0] == 2) {
				pop();
			} else if (arr1[i][0] == 3) {
				front();
			}
		}

	}

}