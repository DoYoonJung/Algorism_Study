package algorism_Level_03;

import java.util.Scanner;

//attackrange
public class Simple_Brute_ForceAlgorithm_AttackRange {

	public static void main(String[] args) {

		// Please Enter Your Code Here

		Scanner in = new Scanner(System.in);

		int answer = in.nextInt();

		int[][] arr = new int[answer][answer];

		int a = in.nextInt() - 1;
		int b = in.nextInt() - 1;
		int n = in.nextInt();

		for (int i = 0; i < answer; i++) {
			for (int j = 0; j < answer; j++) {
				for (int k = 1; k <= n; k++) {
					if ((Math.abs(a - i) + Math.abs(b - j)) == k) {
						arr[i][j] = k;
					}
				}

			}
		}
		arr[a][b] = -1;
		for (int i = 0; i < answer; i++) {
			for (int j = 0; j < answer; j++) {
				if (arr[i][j] == -1) {
					System.out.print("x" + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
