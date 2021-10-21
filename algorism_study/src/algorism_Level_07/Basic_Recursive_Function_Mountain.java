package algorism_Level_07;

import java.util.Scanner;

//mountain
public class Basic_Recursive_Function_Mountain {

	public static void getMountain(int n) {

		if (n == 1) {
			System.out.print(1);
		} else {
			getMountain(n - 1);
			System.out.print(n);
			getMountain(n - 1);
		}
	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		getMountain(n);

	}
}
