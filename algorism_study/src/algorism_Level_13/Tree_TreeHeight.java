package algorism_Level_13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//트리의 높이
public class Tree_TreeHeight {

	public static void height(int x) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int r = in.nextInt();

		int[][] arr = new int[105][5];

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		q.offer(r);
		q.offer(-1);
		int count = 0;
		while (true) {
			if (q.peek() == -1) {
				q.poll();
				if (q.isEmpty() == true) {
					break;
				}
				count++;
				q.offer(-1);
			} else {
				for (int i = 0; i < n - 1; i++) {
					if (arr[i][1] == q.peek()) {
						q.offer(arr[i][0]);
						arr[i][0] = -1;

					}

					else if (arr[i][0] == q.peek()) {
						q.offer(arr[i][1]);
						arr[i][1] = -1;

					}
				}
				q.poll();
			}

		}

		System.out.println(count);

	}

}
