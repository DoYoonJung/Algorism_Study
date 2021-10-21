package algorism_Level_10;

import java.util.Arrays;
import java.util.Scanner;

//두 용액(87점)
public class Binary_Search_TwoSolutions {

	static int myStart = 0;
	static int myEnd = 0;

	public static long getResult(long[] arr, int start, int end, long a, long arr2) {

		if (start + 1 == end) {

			if (Math.abs(arr[start] + arr2) <= Math.abs(arr[end] + arr2)) {
				if (arr[start] == arr2) {
					return end;
				} else {
					return start;
				}

			} else {
				if (arr[end] == arr2) {
					return start;
				} else {
					return end;
				}

			}
		} else {
			int mid = (start + end) / 2;

			if (arr[mid] == a) {
				return mid;
			} else if (arr[mid] > a) {
				return getResult(arr, start, mid, a, arr2);
			} else {
				return getResult(arr, mid, end, a, arr2);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long[] arr = new long[n + 5];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr, 0, n);
		long k = 1100000000;
		String tt = "";

		long inx = 0;
		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				myStart = i;
				myEnd = n - 1;

				long a = 0;
				if (arr[i] <= 0) {
					a = Math.abs(arr[i]);
				} else {
					a = -arr[i];
				}

				if (arr[n - 1] <= a) {
					inx = n - 1;
				} else if (arr[0] >= a) {
					inx = 0;
				} else {

					inx = getResult(arr, i, n - 1, a, arr[i]);

				}

				if (Math.abs(arr[i] + arr[(int) inx]) < k) {
					k = Math.abs(arr[i] + arr[(int) inx]);
					tt = arr[i] + " " + arr[(int) inx];
				}

			}
		}
		System.out.println(tt);
	}

}