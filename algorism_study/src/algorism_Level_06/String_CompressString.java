package algorism_Level_06;

import java.util.Scanner;

//문자열 압축
public class String_CompressString {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		String a = in.next();

		int b = a.length();

		char[] arr = new char[b];

		for (int i = 0; i < b; i++) {
			arr[i] = a.charAt(i);

		}
		int c = 0;
		int k = 0;

		while (true) {

			int cnt = 1;
			for (int i = k; i < b; i++) {

				if (arr[c] != arr[i] && c != i) {
					break;
				} else if (arr[c] == arr[i] && c != i) {
					cnt++;
				}
			}

			if (cnt == 1) {
				System.out.print(arr[c]);
			} else {
				System.out.print(cnt + "" + arr[c]);
			}
			c = c + cnt;
			k = k + cnt;

			if (c >= b) {
				break;
			}
		}

	}
}