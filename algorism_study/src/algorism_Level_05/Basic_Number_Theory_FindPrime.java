package algorism_Level_05;

import java.util.Scanner;

//findprime
public class Basic_Number_Theory_FindPrime {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[110];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int a = 0;
		for (int i = 0; i < n; i++) {
			int check = 0;
			for (int j = 2; j <= arr[i] - 1; j++) {
				if (arr[i] % j == 0) {
					check = 1;
				}

			}
			if (check == 0 && arr[i] != 1) {
				a++;
			}

		}
		System.out.print(a);

	}
}