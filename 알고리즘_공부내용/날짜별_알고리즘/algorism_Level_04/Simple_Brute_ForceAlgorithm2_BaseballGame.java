package algorism_Level_04;

import java.util.Scanner;

//baseball game
public class Simple_Brute_ForceAlgorithm2_BaseballGame {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[1010];
		int[] strike = new int[1010];
		int[] ball = new int[1010];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			strike[i] = in.nextInt();
			ball[i] = in.nextInt();
		}

		int[] table = new int[1000];

		for (int k = 0; k < n; k++) {
			int a = arr[k] / 100;
			int b = (arr[k] / 10) % 10;
			int c = arr[k] % 10;
			int one = 1;
			int two = 2;
			int three = 2;
			int total = 111;

			while (true) {

				three++;

				if (three >= 10) {
					three = 1;
					two++;
				}
				if (two >= 10) {
					two = 1;
					if (two == three) {
						three++;
					}
					one++;
				}

				if (one >= 10) {
					break;
				}

				if (one == two || two == three || three == one) {
					continue;
				}

				int Strike = 0;
				int Ball = 0;

				if (one == a) {
					Strike++;
				} else if ((two != b && one == b) || (three != c && one == c)) {
					Ball++;
				}
				if (two == b) {
					Strike++;
				} else if ((one != a && two == a) || (three != c && two == c)) {
					Ball++;
				}
				if (three == c) {
					Strike++;
				} else if ((two != b && three == b) || (one != a && three == a)) {
					Ball++;
				}

				String oo = one + "" + two + "" + three;
				int tt = Integer.parseInt(oo);
				if (Strike == strike[k] && Ball == ball[k]) {
					table[tt]++;
				}
			}
		}

		int ccc = 0;

		for (int i = 123; i < table.length; i++) {
			if (table[i] == n) {
				ccc++;
			}

		}

		System.out.println(ccc);
	}

}