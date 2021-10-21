package algorism_Level_06;

import java.util.Scanner;

//문자열 뒤집기
public class String_StringFlip {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		String a = in.nextLine();

		char[] arr = new char[a.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.charAt(i);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}