package algorism_Level_05;

import java.util.Scanner;

//lcm
public class Basic_Number_Theory_Lcm {

	public static void main(String[] args) {

		// Please Enter Your Code Here

		Scanner in = new Scanner(System.in);

		long a = in.nextInt();
		long b = in.nextInt();

		long a1 = a;
		long b1 = b;
		if (a < b) {
			long temp = a;
			a = b;
			b = temp;
		}

		long gcd = 0;
		while (true) {

			long r = a % b;

			if (r == 0) {
				gcd = b;
				break;
			}

			a = b;
			b = r;

		}

		System.out.println((a1 / gcd) * (b1 / gcd) * gcd);

	}
}