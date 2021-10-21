package algorism_Level_05;

import java.util.Scanner;

//pfactoriztion
public class Basic_Number_Theory_Pfactoriztion {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 2; n > 1; i++) {
			if (n % i == 0) {
				System.out.println(i);
				n = n / i;
				i--;
			}
		}
	}
}