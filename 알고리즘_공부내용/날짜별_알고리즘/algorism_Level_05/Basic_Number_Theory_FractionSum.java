package algorism_Level_05;

import java.util.Scanner;

//fractionsum
public class Basic_Number_Theory_FractionSum {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int b1 = b;
		int c = in.nextInt();
		int d = in.nextInt();
		int d1 = d;
		int gcd = 0;
		int lcm = 0;
		while (true) {
			int r = b % d;

			if (r == 0) {
				gcd = d;
				break;
			}
			b = d;
			d = r;

		}
		lcm = (b1 / gcd) * (d1 / gcd) * gcd;

		a = a * (lcm / b1);
		c = c * (lcm / d1);

		int k = a + c;
		int k1 = k;
		int lcm1 = lcm;
		int gcd1 = 0;
		while (true) {
			int r = k % lcm;

			if (r == 0) {
				gcd1 = lcm;
				break;
			}
			k = lcm;
			lcm = r;
		}
		System.out.print(k1 / gcd1 + " ");
		System.out.print(lcm1 / gcd1 + " ");

	}
}