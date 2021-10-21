package algorism_Level_15;

import java.util.Scanner;

//합병정렬 구현하기
public class Divide_And_Counquer__Memoization_MergerSortImplement {

	static int[] temp = new int[100010];

	public static void merging(int[] arr, int s1, int e1, int s2, int e2) {
		int p = s1;
		int q = s2;

		int temp_inx = 0;

		while (p <= e1 && q <= e2) {
			if (arr[p] <= arr[q]) {
				temp[temp_inx++] = arr[p];
				p++;
			} else {
				temp[temp_inx++] = arr[q];
				q++;
			}
		}

		if (p > e1) {
			for (int i = q; i <= e2; i++) {
				temp[temp_inx++] = arr[i];
			}
		} else {
			for (int i = p; i <= e1; i++) {
				temp[temp_inx++] = arr[i];
			}
		}

		for (int i = s1; i <= e2; i++) {
			arr[i] = temp[i - s1];
		}

	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		} else {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merging(arr, start, mid, mid + 1, end);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[100010];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		mergeSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}