package algorism;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListNode {

	public static int binary(int[] arr, int start, int end, int value) {
		if (arr[start] == value) {
			return start;
		}
		if (start + 1 == end) {
			if (arr[end] == value) {
				return end;
			} else {
				return -1;
			}

		} else {
			int mid = (start + end) / 2;

			if (arr[mid] == value) {
				return binary(arr, start, mid, value);
			} else if (arr[mid] > value) {
				return binary(arr, start, mid - 1, value);
			} else {
				return binary(arr, mid, end, value);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[100010];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr, 0, n);

		int[][] result = new int[100010][4];

		for (int i = 0; i < m; i++) {
			result[i][0] = in.nextInt();
		}

		for (int i = 0; i < m; i++) {

			int inx = binary(arr, 0, n - 1, result[i][0]);

			System.out.println(inx);

		}

		/*
		 * for (int i = 0; i < m; i++) { System.out.println(result[i][1]); }
		 */

	}

}
