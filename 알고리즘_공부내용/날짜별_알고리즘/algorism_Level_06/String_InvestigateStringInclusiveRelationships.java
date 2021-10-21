package algorism_Level_06;

import java.util.Scanner;

//문자열 포함 관계 조사
public class String_InvestigateStringInclusiveRelationships {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		String a = in.next();
		String b = in.next();

		if (a.contains(b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
