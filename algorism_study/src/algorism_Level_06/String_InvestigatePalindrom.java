package algorism_Level_06;

import java.util.Scanner;

//팰린드롬 조사
public class String_InvestigatePalindrom {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		String a = in.next();

		int b = a.length();
		int check = 0;
		for (int i = 0; i < b; i++) {
			if (a.charAt(i) != a.charAt(b - 1 - i)) {
				check = 1;
				break;

			}
		}

		if (check == 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}