package algorism_Level_08;

import java.util.Scanner;

//division
public class Advanced_Brute_Force_Division {

	static int[] arr = new int[100];
	static int cnt = 0;
	static int count = 0;

	public static void getResult(int x, int n) {

		if (cnt >= n) {
			int t = arr[0];
			int abc = -1;
			for (int i = 0; i < n; i++) {
				if (arr[i] <= t) {
					t = arr[i];
				} else {
					abc = 1;
				}
			}
			if (abc == -1) {
				count++;
				for (int i = 0; i < n; i++) {
					if (arr[i] != 0) {
						System.out.print(arr[i]);
						if (arr[i + 1] != 0) {
							System.out.print("+");
						}
					}
				}
				System.out.println();
			}

		} else {
			for (int i = n - 1; i >= 1; i--) {
				if (cnt + i <= n) {
					arr[x] = i;
					cnt = cnt + i;
					getResult(x + 1, n);
					arr[x] = 0;
					cnt = cnt - i;
				}

			}

		}

	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		getResult(0, n);
		System.out.println(count);
	}
}