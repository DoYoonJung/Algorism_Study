package algorism_Level_10;

import java.util.Arrays;
import java.util.Scanner;

//숫자 박스
public class Binary_Search_NumericBox {

	public static int binary(int[] arr, int start, int end, int value) {

		int myStart = start;
		int myEnd = end;
		int mid = 0;
		if (arr[start] > value) {
			return -1;
		} else if (arr[start] == value)
			return start;

		if (arr[end] < value) {
			return -1;
		} else if (arr[end] == value)
			return end;

		while (myStart + 1 < myEnd) {
			mid = (myStart + myEnd) / 2;

			if (arr[mid] == value) {
				return mid;

			} else if (arr[mid] > value) {
				myEnd = mid;
			} else {
				myStart = mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[n + 5];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr, 0, n);

		int m = in.nextInt();

		int[] result = new int[m + 5];

		for (int i = 0; i < m; i++) {
			result[i] = in.nextInt();
		}

		for (int i = 0; i < m; i++) {
			int inx = binary(arr, 0, n - 1, result[i]);

			if (inx == -1) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}

	}
}