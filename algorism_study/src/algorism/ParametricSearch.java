package algorism;

import java.util.Scanner;

public class ParametricSearch {

	static Scanner in = new Scanner(System.in);
	static long n = in.nextLong();
	static long[] arr1 = new long[(int) n + 5];
	static long[] arr2 = new long[(int) n + 5];

	static long m;

	public static boolean check(long a) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (a > arr2[i]) {
				sum += arr2[i] - arr1[i] + 1;
			} else {
				if (arr1[i] < a) {
					sum += a - arr1[i];
				}

			}

		}

		if (sum > m) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextLong();
			arr2[i] = in.nextLong();
		}
		long start = arr1[0];
		long end = arr2[(int) 0];

		for (int i = 0; i < n; i++) {
			if (start >= arr1[i]) {
				start = arr1[i];
			}

			if (end <= arr2[i]) {
				end = arr2[i];
			}
		}
		start = start - 1;
		end = end + 1;

		long m1 = in.nextInt();
		m = m1;

		while (start + 1 != end) {
			long mid = (start + end) / 2;

			if (check(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		System.out.println(start);

	}

}