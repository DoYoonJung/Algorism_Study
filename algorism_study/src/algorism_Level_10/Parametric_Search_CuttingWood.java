package algorism_Level_10;

import java.util.Arrays;
import java.util.Scanner;

//나무 자르기
public class Parametric_Search_CuttingWood {

	static Scanner in = new Scanner(System.in);
	static int n = in.nextInt();

	static long m = in.nextLong();
	static long[] arr = new long[n + 5];

	public static boolean check(long a) {

		long sum = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] - a > 0) {
				sum += arr[i] - a;
			}

		}

		if (sum >= m) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 0; k < n; k++) {
			arr[k] = in.nextInt();
		}
		long start = 0;
		Arrays.sort(arr, 0, n);

		long end = arr[n - 1];

		while (start + 1 < end) {
			long mid = (start + end) / 2;

			if (check(mid)) {
				start = mid;
			} else {
				end = mid;
			}
		}
		System.out.println(start);

	}

}
