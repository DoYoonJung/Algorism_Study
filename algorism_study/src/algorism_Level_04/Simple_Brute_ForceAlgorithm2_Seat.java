package algorism_Level_04;

import java.util.Scanner;

//seat
public class Simple_Brute_ForceAlgorithm2_Seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		int[][] arr = new int[1010][1010];

		int check2 = 0;
		int b = 0;
		int human = 1;
		if (k > r * c) {
			System.out.print(0);
		} else {
			while (human < r * c) {

				for (int i = c - 1; i >= 0; i--) {
					if (arr[i][check2] == 0) {
						arr[i][check2] = human;
						human++;
						b = i;
					}
				}

				check2 = b;
				for (int i = 0; i < r; i++) {
					if (arr[check2][i] == 0) {
						arr[check2][i] = human;
						human++;
						b = i;
					}
				}
				check2 = b;

				for (int i = 0; i < c; i++) {
					if (arr[i][check2] == 0) {
						arr[i][check2] = human;
						human++;
						b = i;
					}
				}
				check2 = b;

				for (int i = r - 1; i >= 0; i--) {
					if (arr[check2][i] == 0) {
						arr[check2][i] = human;
						human++;
						b = i;
					}
				}
				check2 = b;
				if (human >= k) {
					break;
				}

			}
			int h = 0;

			for (int i = c - 1; i >= 0; i--) {
				for (int j = 0; j < r; j++) {
					if (arr[h][j] == k) {
						System.out.print((j + 1) + " " + (i + 1));
					}
				}
				h++;
			}
		}

	}
}