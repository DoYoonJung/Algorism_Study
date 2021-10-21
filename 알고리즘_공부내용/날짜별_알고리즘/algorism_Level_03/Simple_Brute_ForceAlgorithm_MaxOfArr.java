package algorism_Level_03;

import java.util.Scanner;

//maxofarr
public class Simple_Brute_ForceAlgorithm_MaxOfArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[][] arr = new int[9][9];
		int a = 0;
		int n = -1;
		int m = -1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = in.nextInt();

			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > a) {
					a = arr[i][j];
					n = i + 1;
					m = j + 1;
				}

			}
		}
		System.out.println(a);
		System.out.print(n + " " + m);

	}
}
