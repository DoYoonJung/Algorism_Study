package algorism_Level_10;

import java.util.Scanner;

//nn´ÜÇ¥
public class Parametric_Search_NN {

	static Scanner in = new Scanner(System.in);
	static long n = in.nextLong();
	static long m = in.nextLong();

	public static boolean check(long a) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			if (a / i < n) {
				sum += a / i;
			} else {
				sum += n;
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

		long start = 0;
		long end = n * n;

		while (start + 1 < end) {
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
