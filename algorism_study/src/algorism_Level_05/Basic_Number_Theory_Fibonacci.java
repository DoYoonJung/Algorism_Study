package algorism_Level_05;

import java.util.Scanner;

//fibonacci
public class Basic_Number_Theory_Fibonacci {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int[] arr = new int[50];
		arr[1] = 1;
		int n = in.nextInt();
		for (int i = 2; i <= n; i++) {

			for (int j = i - 2; j < i; j++) {
				arr[i] = arr[i] + arr[j];

			}
		}

		System.out.println(arr[n]);
	}
}
