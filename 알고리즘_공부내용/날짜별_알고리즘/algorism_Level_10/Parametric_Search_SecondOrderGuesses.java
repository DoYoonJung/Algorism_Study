package algorism_Level_10;

import java.util.Scanner;

//2차식 정답 추측
public class Parametric_Search_SecondOrderGuesses {

	static Scanner in = new Scanner(System.in);

	static long n = in.nextLong();

	public static boolean check(long a) {

		if (a * a + a > n) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		long start = 0;
		long end = 1000000001;

		while (start + 1 < end) {
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
