package algorism_Level_05;

import java.util.Scanner;

//nextnum
public class Basic_Number_Theory_NextNum {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		while (true) {

			int check = 0;
			int result = 0;
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();

			for (int i = 0; i < 3; i++) {

			}
			if (c - b == d - c) {
				check = 1;
			}

			else if (c / b == d / c) {
				check = 2;
			}

			if (b == c && c == d && d == b) {
				check = 0;
			}

			if (check == 1) {
				result = d + c - b;
				System.out.print("AP" + " ");
				System.out.print(result);
				System.out.println();
			} else if (check == 2) {
				result = d * (c / b);
				System.out.print("GP" + " ");
				System.out.print(result);
				System.out.println();
			} else {
				break;
			}

		}

	}
}