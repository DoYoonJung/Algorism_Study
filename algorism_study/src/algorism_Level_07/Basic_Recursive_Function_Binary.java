package algorism_Level_07;

import java.util.Scanner;

//binary
public class Basic_Recursive_Function_Binary {

	public static void getBinary(int a) {
		if (a == 0) {
			System.out.print(0);

		} else if (a == 1) {
			System.out.print(1);
		} else {
			getBinary(a / 2);
			System.out.print(a % 2);
		}

	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		getBinary(n);
	}
}