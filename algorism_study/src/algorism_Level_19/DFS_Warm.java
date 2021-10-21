package algorism_Level_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_Warm {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();

	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	static int count = 0;
	static boolean[] check = new boolean[n + 5];

	public static void BFS() {
		Queue queue = new LinkedList();

		queue.offer(1);
		check[1] = true;

		while (!queue.isEmpty()) {
			int a = (int) queue.peek();
			count++;
			queue.poll();

			for (int i = 0; i < arr.get(a).size(); i++) {
				int next = arr.get(a).get(i);

				if (check[next] == false) {
					check[next] = true;
					queue.offer(next);
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			arr.get(a).add(b);
			arr.get(b).add(a);
		}

		BFS();
		System.out.println(count - 1);
	}

}
