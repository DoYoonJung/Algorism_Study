package algorism_Level_03;

import java.util.Scanner;

//GCD LCM
public class Simple_Brute_ForceAlgorithm_GCDLCM {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();

		int n = 0;
		int gcd = 0;
		if (a > b) {
			n = b;
		} else {
			n = a;
		}
		for (int i = 1; i <= n; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		System.out.println(a * b / gcd);

	}
}