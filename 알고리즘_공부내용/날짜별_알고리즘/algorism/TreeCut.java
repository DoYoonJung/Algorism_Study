package algorism;

import java.util.Arrays;
import java.util.Scanner;

public class TreeCut {
	static Scanner in = new Scanner(System.in);
	static long n = in.nextLong();
	static long[] arr1 = new long[(int) n + 5];
	static long[] arr2 = new long[(int) n + 5];

	static long m;

	public static boolean check(long a) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (a - arr1[i] >= 0) {
				sum += a - arr1[i];
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

		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextLong();
			arr2[i] = in.nextLong();
		}
		Arrays.sort(arr1, 0, (int) n);
		Arrays.sort(arr2, 0, (int) n);

		long m1 = in.nextInt();
		m = m1;
		long start = arr1[0] - 1;
		long end = arr2[(int) n - 1] + 1;

		while (start + 1 != end) {
			long mid = (start + end) / 2;

			if (check(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		System.out.println(end);

	}

}
