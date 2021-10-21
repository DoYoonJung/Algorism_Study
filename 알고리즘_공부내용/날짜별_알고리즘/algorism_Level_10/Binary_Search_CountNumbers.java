package algorism_Level_10;

import java.util.Arrays;
import java.util.Scanner;

//숫자 개수 세기
public class Binary_Search_CountNumbers {

	public static int result1(int[] arr, int start, int end, int value) {
		if (start + 1 == end) {
			if (arr[end] != value) {
				return 0;
			} else {
				return end;
			}
		}

		if (start >= end) {
			return -1;
		} else {
			int mid = (start + end) / 2;

			if (arr[mid] >= value) {
				return result1(arr, start, mid, value);
			} else {
				return result1(arr, mid, end, value);
			}
		}

	}

	public static int result2(int[] arr, int start, int end, int value) {
		if (start + 1 == end) {
			if (arr[start] != value) {
				return 0;
			} else {
				return start;
			}

		}

		if (start >= end) {
			return -1;
		} else {
			int mid = (start + end) / 2;
			if (arr[mid] <= value) {
				return result2(arr, mid, end, value);
			} else {
				return result2(arr, start, mid, value);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[n + 5];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr, 0, n);
		int[] answer = new int[m + 5];

		for (int i = 0; i < m; i++) {
			answer[i] = in.nextInt();
		}
		int s = 0;
		int e = 0;
		for (int i = 0; i < m; i++) {
			if (arr[0] == answer[i]) {
				s = 0;
			} else {
				s = result1(arr, 0, n - 1, answer[i]);
			}

			if (arr[n - 1] == answer[i]) {
				e = n - 1;
			} else {
				e = result2(arr, 0, n - 1, answer[i]);
			}
			if (e == 0 && s == 0) {
				System.out.println(0);
			} else {
				System.out.println(e - s + 1);
			}

		}
	}

}
