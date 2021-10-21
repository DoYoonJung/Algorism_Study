package algorism_Level_06;

import java.util.Scanner;

//대소문자 변환
public class String_UpperAndLowerCaseTranslate {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		String a = in.nextLine();

		int b = a.length();

		int[] arr = new int[b];

		for (int i = 0; i < b; i++) {
			arr[i] = (int) a.charAt(i);

			if (arr[i] <= 90 && arr[i] >= 65) {
				arr[i] += 32;
			} else if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] -= 32;
			}
		}
		for (int i = 0; i < b; i++) {
			System.out.print((char) arr[i]);

		}

	}
}