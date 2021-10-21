package algorism_Level_12;

import java.util.Scanner;

//원형 큐 구현하기
public class Queue_CircleQueueImplemebt {

	static Scanner in = new Scanner(System.in);
	final static int scale = in.nextInt();
	static int count = in.nextInt();

	static int[] arr = new int[105];
	static int[][] arr1 = new int[1005][4];

	static int f = 0;
	static int r = 0;
	static int num = 0;

	public static void push(int y) {
		if (num >= scale) {
			System.out.println("Overflow");
		} else {
			arr[r] = y;
			r = (r + 1) % scale;
			num++;
		}

	}

	public static void pop() {
		if (num <= 0) {
			System.out.println("Underflow");
		} else {
			arr[f] = 0;
			f = (f + 1) % scale;
			num--;
		}

	}

	public static void front() {
		if (num == 0) {
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
				push(arr1[i][1]);
			} else if (arr1[i][0] == 2) {
				pop();
			} else {
				front();
			}
		}

	}

}