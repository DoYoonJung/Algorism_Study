package algorism_Level_10;

import java.util.Scanner;

//중복없는 구간
public class Parametric_Search_AreaFreeOfDuplicates {

	static Scanner in = new Scanner(System.in);
	static long n = in.nextLong();

	static long[] arr = new long[(int) (n + 5)];

	public static boolean check(long a) {
		long[] answer = new long[(int) (n + 5)];
		long[] answer1 = new long[(int) (n + 5)];
		int cnt = 0;
		for (int i = 0; i < a; i++) {
			answer[(int) arr[i]]++;
			if (answer[(int) arr[i]] == 2) {
				answer1[(int) arr[i]] = 2;
				cnt++;
			}
		}

		if (cnt == 0) {
			return false;
		} else {
			int k = (int) a;
			int zero = 0;
			for (int x = k; x < n; x++) {
				answer[(int) arr[x]]++;
				answer[(int) arr[zero]]--;
				if (answer1[(int) arr[zero]] == 2) {
					if (answer[(int) arr[zero]] < 2) {
						answer1[(int) arr[zero]] = 0;
						cnt--;
					}
				}
				if (answer1[(int) arr[x]] != 2) {
					if (answer[(int) arr[x]] >= 2) {
						answer1[(int) arr[x]] = 2;
						cnt++;
					}
				}

				zero++;
				if (cnt == 0) {
					return false;
				}

			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = 0;
		long end = n + 1;

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

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