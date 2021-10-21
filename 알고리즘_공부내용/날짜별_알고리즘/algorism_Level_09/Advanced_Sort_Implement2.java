package algorism_Level_09;

import java.util.Scanner;

//퀵정렬 구현하기
public class Advanced_Sort_Implement2 {

	static int[] left = new int[100000];
	static int[] right = new int[100000];

	public static int getLeft(int[] arr, int start, int end, int pivot, int[] result) {

		int inx = 0;
		for (int i = start; i <= end; i++) {
			if (arr[i] <= pivot) {
				result[inx++] = arr[i];
			}

		}

		return inx;
	}

	public static int getRight(int[] arr, int start, int end, int pivot, int[] result) {
		int inx = 0;

		for (int i = start; i <= end; i++) {
			if (arr[i] > pivot) {
				result[inx++] = arr[i];
			}
		}
		return inx;
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		} else {
			int pivot = arr[start];

			int Left_cnt = getLeft(arr, start + 1, end, pivot, left);
			int Right_cnt = getRight(arr, start + 1, end, pivot, right);

			for (int i = 0; i < Left_cnt; i++) {
				arr[start + i] = left[i];
			}
			arr[start + Left_cnt] = pivot;

			for (int i = 0; i < Right_cnt; i++) {
				arr[start + Left_cnt + 1 + i] = right[i];
			}

			quickSort(arr, start, start + Left_cnt - 1);
			quickSort(arr, start + Left_cnt + 1, end);
		}
	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[100010];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}