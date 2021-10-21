package algorism;

import java.util.Scanner;

public class Godeubjegob {

	static Scanner in = new Scanner(System.in);
	static long n = in.nextLong();
	static long m = in.nextLong();

	public static long getSum(long n, long m) {
		if (m == 1) {
			return n;
		} else {
			if (m % 2 == 0) {
				return getSum(n, m / 2) * getSum(n, m / 2);
			} else {
				return getSum(n, m - 1) * n;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = getSum(n, m) % 10007;
		System.out.println(a);

	}

}
