package algorism;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Epidemic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int answer = in.nextInt();

		int count = in.nextInt();

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(count);

		int[] arr = new int[100005];
		int r = 0;
		while (q.isEmpty() == false) {
			int cnt = 0;
			int a = q.poll();

			for (int i = 0; i < answer; i++) {

				if (arr[i] == a) {
					cnt = 1;
					break;

				}
			}
			if (cnt == 0) {
				arr[r] = a;
				r++;
			}

			if (a * 2 <= answer && cnt == 0) {
				q.offer(a * 2);

			}

			if (a / 3 != 0 && cnt == 0) {
				q.offer(a / 3);
			}

		}

		System.out.println(answer - r);

	}

}
