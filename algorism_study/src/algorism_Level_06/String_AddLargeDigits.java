package algorism_Level_06;

import java.util.Scanner;

//Å«ÀÚ¸´¼ö µ¡¼À
public class String_AddLargeDigits {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		String a = in.next();
		String b = in.next();

		if (b.length() > a.length()) {
			String temp = a;
			a = b;
			b = temp;

		} else if (b.length() == a.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (Integer.parseInt(a.substring(i, i + 1)) < Integer.parseInt(b.substring(i, i + 1))) {
					String temp = a;
					a = b;
					b = temp;
					break;
				} else if (Integer.parseInt(a.substring(i, i + 1)) > Integer.parseInt(b.substring(i, i + 1))) {
					break;
				}
			}
		}

		int[] aa = new int[110];
		int[] bb = new int[110];
		int k = 0;

		for (int i = a.length() - 1; i >= 0; i--) {
			aa[k] = Integer.parseInt(a.substring(i, i + 1));
			k++;

		}

		k = 0;
		for (int i = b.length() - 1; i >= 0; i--) {
			bb[k] = Integer.parseInt(b.substring(i, i + 1));

			k++;
		}

		int[] arr = new int[10010];

		int y = 0;
		int x = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (aa[y] + bb[y] + arr[i] >= 10) {
				arr[i - 1] += (aa[y] + bb[y] + arr[i]) / 10;
				arr[i] = (aa[y] + bb[y] + arr[i]) % 10;
			} else {
				arr[i] += aa[y] + bb[y];
			}

			y++;
			if (y == b.length()) {
				x = i - 1;
				break;
			}
		}

		for (int i = y; i < a.length(); i++) {
			if (arr[x] + aa[i] >= 10) {
				arr[x - 1] += (arr[x] + aa[i]) / 10;
				arr[x] = (arr[x] + aa[i]) % 10;
			} else {
				arr[x] += aa[i];
			}

			x--;
		}
		int tt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				tt = i;
				break;
			}
		}

		for (int i = tt; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
}
