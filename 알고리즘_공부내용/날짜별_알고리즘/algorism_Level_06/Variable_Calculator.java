package algorism_Level_06;

import java.util.Scanner;

//°è»ê±â
public class Variable_Calculator {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		char c = in.next().charAt(0);
		int b = in.nextInt();

		if (c == '+')
			System.out.println(a + b);
		else if (c == '*')
			System.out.println(a * b);
		else if (c == '/')
			System.out.println(a / b);
		else if (c == '-')
			System.out.println(a - b);

	}
}