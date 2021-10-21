package algorism_Level_05;

import java.util.Scanner;

//sequencesum
public class Basic_Number_Theory_SequenceSum {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[1050][1050];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				arr[i][j] = in.nextInt();

			}
		}

		int a = (arr[0][1] + arr[0][2] - arr[1][2]) / 2;
		System.out.print(a + " ");
		for (int i = 1; i < n; i++) {
			System.out.print((arr[0][i] - a) + " ");
		}

	}
}