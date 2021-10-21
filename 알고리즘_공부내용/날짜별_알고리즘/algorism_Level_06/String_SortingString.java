package algorism_Level_06;

import java.util.Scanner;

//문자열 정렬
public class String_SortingString {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		String[] arr = new String[a];

		for (int i = 0; i < a; i++) {
			arr[i] = in.next();
		}

		for (int i = 0; i < a; i++) {
			String inx = arr[i];
			int k = i;
			for (int j = i; j < a; j++) {
				if (inx.compareTo(arr[j]) > 0) {
					inx = arr[j];
					k = j;
				}
			}

			String temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;

		}
		for (int i = 0; i < a; i++) {
			System.out.println(arr[i]);

		}

	}
}