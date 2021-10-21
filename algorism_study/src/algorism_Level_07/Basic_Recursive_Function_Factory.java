package algorism_Level_07;

import java.util.Scanner;

//ÆÑÅä¸®¾ó
public class Basic_Recursive_Function_Factory {

	public static int getFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return getFactorial(n - 1) * n;
		}
	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		System.out.print(getFactorial(n));
	}
}