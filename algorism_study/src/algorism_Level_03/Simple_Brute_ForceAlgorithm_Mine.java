package algorism_Level_03;

import java.util.Scanner;

//mine
public class Simple_Brute_ForceAlgorithm_Mine {

	public static void main(String[] args) {

		// Please Enter Your Code Here

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int[][] arr = new int[a][b];

		int c = in.nextInt() - 1;
		int d = in.nextInt() - 1;
		int n = 0;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = in.nextInt();

			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				if ((Math.abs(c - i) + Math.abs(d - j)) == 1) {
					if (arr[i][j] == 1) {
						n++;
					}
				} else if ((Math.abs(c - i) + Math.abs(d - j)) == 2 && Math.abs(c - i) == 1 && Math.abs(d - j) == 1) {
					if (arr[i][j] == 1) {
						n++;
					}
				}

			}
		}
		if (arr[c][d] == 1) {
			System.out.print("game over");
		} else {
			System.out.println(n);
		}

	}
}