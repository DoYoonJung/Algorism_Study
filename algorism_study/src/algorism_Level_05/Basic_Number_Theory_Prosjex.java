package algorism_Level_05;

import java.util.Scanner;

//PROSJEK
public class Basic_Number_Theory_Prosjex {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] B = new int[110];
		int[] A = new int[110];

		for (int i = 0; i < n; i++) {
			B[i] = in.nextInt();
		}
		A[0] = B[0];

		for (int i = 1; i < n; i++) {
			A[i] = B[i] * (i + 1);
			for (int j = 0; j < i; j++) {

				A[i] -= A[j];

			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}

	}
}