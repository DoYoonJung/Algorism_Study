package algorism_Level_03;

// eightnine
import java.util.Scanner;

public class Simple_Brute_ForceAlgorithm_EightNine {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int[][] arr = new int[a][b];
		int[][] arr1 = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[i][j] = arr[i][(b - 1) - j];

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr1[i][j] + " ");

			}
			System.out.println();
		}

	}
}