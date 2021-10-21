package algorism_Level_04;

import java.util.Scanner;

//bingo
public class Simple_Brute_ForceAlgorithm2_Bingo {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[5][5];
		int[][] arr1 = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr1[i][j] = in.nextInt();
			}
		}
		int a = 0;
		int b = 0;
		int n = 0;
		while (true) {
			n++;
			int cnt = 0;
			int count = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr1[a][b] == arr[i][j]) {

						arr[i][j] = 0;
					}
				}
			}
			b++;
			if (b == 5) {
				a++;
				b = 0;
			}

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[i][j] == 0) {
						cnt++;
					}
					if (cnt == 5) {
						count++;
					}
				}
				cnt = 0;
			}

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[j][i] == 0) {
						cnt++;
					}
					if (cnt == 5) {
						count++;
					}
				}
				cnt = 0;
			}

			for (int i = 0; i < 5; i++) {

				if (arr[i][i] == 0) {
					cnt++;
				}
				if (cnt == 5) {
					count++;
				}
			}
			cnt = 0;
			int k = 4;
			for (int i = 0; i < 5; i++) {

				if (arr[i][k] == 0) {
					cnt++;
					k--;
				}
				if (cnt == 5) {
					count++;
				}
			}
			cnt = 0;

			if (count >= 3) {
				break;
			}
		}

		System.out.println(n);

	}
}