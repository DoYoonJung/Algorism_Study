package algorism_Level_06;

import java.util.Scanner;

//과제물 망치기
public class String_RuiningTheAssignment {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();

		String[] arr = a.split(" ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
}