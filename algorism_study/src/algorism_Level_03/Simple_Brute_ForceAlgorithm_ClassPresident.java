package algorism_Level_03;

import java.util.Scanner;

//class president
public class Simple_Brute_ForceAlgorithm_ClassPresident {

	public static void main(String[] args) {

		// Please Enter Your Code Here

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		int[][] abc = new int[a + 10][a + 10];

		int[][] arr1 = new int[a + 10][10];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 5; j++) {
				arr1[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < a; k++) {
					if (arr1[i][j] == arr1[k][j] && i != k) {
						abc[i][k] = 1;
					}
				}
			}
		}

		int b = -1;
		int c = -1;
		for (int i = 0; i < a; i++) {
			int g = 0;
			for (int j = 0; j < a; j++) {
				if (abc[i][j] == 1) {
					g++;
				}
			}

			if (b < g) {
				b = g;
				c = i;
			}
		}
		System.out.println(c + 1);
	}
}