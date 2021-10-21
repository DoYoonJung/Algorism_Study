package algorism_Level_05;

import java.util.Scanner;

//combincationpascal
public class Basic_Number_Theory_CombinationPascal {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		long n = in.nextInt();
		long m = in.nextInt();

		long d = 1;

		long a = 1;
		for (long i = n; i > n - m; i--) {
			d = d * i;
			d = d / a;
			a++;
		}

		System.out.print(d);

	}
}