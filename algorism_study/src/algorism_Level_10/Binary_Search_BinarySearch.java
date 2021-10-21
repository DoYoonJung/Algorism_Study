package algorism_Level_10;

import java.util.Scanner;

//ÀÌÁøÅ½»ö
public class Binary_Search_BinarySearch {

	public static int binarySearch(int[] arr, int start, int end, int value) {
		if (start + 1 == end) {
			if (arr[start] == value) {
				return start;
			} else if (arr[end] == value) {
				return end;
			} else {
				return -1;
			}
		}

		if (start > end) {
			return -1;
		} else if (start == end) {
			if (arr[start] == value) {
				return start;
			} else {
				return -1;
			}
		} else {
			int mid = (start + end) / 2;
			if (arr[mid] == value) {
				return mid;
			} else if (arr[mid] > value) {
				return binarySearch(arr, start, mid - 1, value);
			} else {
				return binarySearch(arr, mid, end, value);
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] result = new int[100010];
		int[] arr = new int[100010];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < m; i++) {
			result[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int inx = binarySearch(arr, 0, n - 1, result[i]);

			if (inx == -1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}