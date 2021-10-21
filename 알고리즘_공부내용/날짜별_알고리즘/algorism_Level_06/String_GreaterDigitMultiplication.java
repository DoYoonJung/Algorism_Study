package algorism_Level_06;

import java.util.Scanner;

//Å«ÀÚ¸´¼ö °ö¼À
public class String_GreaterDigitMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String n = in.next();

		String m = in.next();
		if (n.length() < m.length()) {
			String temp = n;
			n = m;
			m = temp;
		} else if (n.length() == m.length()) {
			for (int i = 0; i < n.length(); i++) {
				if (Integer.parseInt(n.substring(i, i + 1)) < Integer.parseInt(m.substring(i, i + 1))) {
					String temp = n;
					n = m;
					m = temp;
					break;
				} else if (Integer.parseInt(n.substring(i, i + 1)) > Integer.parseInt(m.substring(i, i + 1))) {
					break;
				}
			}
		}
		int[] nn = new int[110];
		int[] mm = new int[110];
		int cnt = 0;
		for (int i = n.length() - 1; i >= 0; i--) {
			nn[cnt] = Integer.parseInt(n.substring(i, i + 1));
			cnt++;
		}
		cnt = 0;
		for (int i = m.length() - 1; i >= 0; i--) {
			mm[cnt] = Integer.parseInt(m.substring(i, i + 1));
			cnt++;
		}

		int[][] answer = new int[m.length() + 50][11000];

		int y = 0;
		for (int j = 0; j < m.length(); j++) {
			int x = 0;

			for (int i = answer[j].length - 1 - j; i >= 0; i--) {

				if (nn[x] * mm[y] >= 10) {
					answer[j][i - 1] += (nn[x] * mm[y]) / 10;
					answer[j][i] += (nn[x] * mm[y]) % 10;
				} else {
					answer[j][i] += nn[x] * mm[y];
				}
				x++;
				if (x > nn.length - 1) {
					break;
				}
			}
			y++;

		}
		int[] answer1 = new int[11000];
		int k = 0;

		for (int i = answer[0].length - 1; i >= 0; i--) {

			for (int j = 0; j < m.length(); j++) {
				answer1[i] += answer[j][i];

			}
			if (answer1[i] >= 10) {
				answer1[i - 1] += answer1[i] / 10;
				answer1[i] = answer1[i] % 10;
			}
		}
		int a = 0;
		for (int i = 0; i < answer1.length; i++) {
			if (answer1[i] != 0) {
				a = i;
				break;
			}
		}

		for (int i = a; i < answer1.length; i++) {
			System.out.print(answer1[i]);
		}

	}

}
