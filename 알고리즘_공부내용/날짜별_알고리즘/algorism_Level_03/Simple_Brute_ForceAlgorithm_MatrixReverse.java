package algorism_Level_03;

//행렬 뒤집기 
import java.util.Scanner;

public class Simple_Brute_ForceAlgorithm_MatrixReverse {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[][] arr = new int[10][10];

		for (int a = 0; a < n; a++) {

			for (int i = 0; i < 10; i++) {

				if (arr[a][i] == 0) {
					arr[a][i] = 1;
				} else if (arr[a][i] == 1) {
					arr[a][i] = 0;
				}
			}

			for (int j = 0; j < 10; j++) {
				if (arr[j][a] == 0) {
					arr[j][a] = 1;
				} else if (arr[j][a] == 1) {
					arr[j][a] = 0;
				}

			}
			arr[a][a] = 1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}