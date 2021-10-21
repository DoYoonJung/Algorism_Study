package algorism_Level_06;

import java.util.Scanner;

//Å«ÀÚ¸´¼ö »¬¼À
public class String_LargeDigitSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String n = in.next();
		String m = in.next();
		int cnt = 0;
		if (n.length() < m.length()) {
			String temp = n;
			n = m;
			m = temp;
			cnt = 1;
		} else if (n.length() == m.length()) {
			for (int i = 0; i < n.length(); i++) {
				if (Integer.parseInt(n.substring(i, i + 1)) < Integer.parseInt(m.substring(i, i + 1))) {
					String temp = n;
					n = m;
					m = temp;
					cnt = 1;
					break;
				} else if (Integer.parseInt(n.substring(i, i + 1)) > Integer.parseInt(m.substring(i, i + 1))) {
					break;
				}
			}
		}

		int[] nn = new int[110];
		int[] mm = new int[110];
		int k = 0;
		for (int i = n.length() - 1; i >= 0; i--) {

			nn[k] = Integer.parseInt(n.substring(i, i + 1));
			k++;
		}

		k = 0;
		for (int i = m.length() - 1; i >= 0; i--) {
			mm[k] = Integer.parseInt(m.substring(i, i + 1));
			k++;
		}

		int[] answer = new int[110];

		int x = 0;
		for (int i = answer.length - 1; i >= 0; i--) {
			if (nn[x] - mm[x] < 0) {
				nn[x + 1] = nn[x + 1] - 1;
				nn[x] += 10;

				answer[i] += nn[x] - mm[x];
			} else {
				answer[i] += nn[x] - mm[x];
			}
			x++;
		}
		int tt = answer.length - 1;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > 0) {
				tt = i;
				break;
			}
		}
		if (cnt == 1) {
			System.out.print("-");
		}
		for (int i = tt; i < answer.length; i++) {
			System.out.print(answer[i]);
		}

	}
}