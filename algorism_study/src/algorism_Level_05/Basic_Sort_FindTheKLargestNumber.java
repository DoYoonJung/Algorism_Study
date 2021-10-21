package algorism_Level_05;

import java.util.Scanner;

//k번째 큰수 찾기
public class Basic_Sort_FindTheKLargestNumber {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		int[] arr = new int[100010];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();

		}

		for (int i = 0; i < k; i++) {
			for (int j = 0; j <= n - i - 2; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.print(arr[n - k]);

	}
}