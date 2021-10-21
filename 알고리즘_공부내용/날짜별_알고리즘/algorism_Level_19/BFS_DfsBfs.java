package algorism_Level_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DfsBfs {

	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();

	static ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
	static boolean[] check = new boolean[n + 5];

	public static void DFS(int x) {
		check[x] = true;
		System.out.print(x + " ");

		for (int i = 0; i < data.get(x).size(); i++) {

			if (check[data.get(x).get(i)] == false) {
				DFS(data.get(x).get(i));
			}

		}

	}

	public static void BFS() {

		Queue queue = new LinkedList();

		queue.offer(0);
		check[0] = true;

		while (queue.isEmpty() == false) {
			int a = (int) queue.peek();
			System.out.print(a + " ");
			queue.poll();

			for (int i = 0; i < data.get(a).size(); i++) {
				if (check[data.get(a).get(i)] == false) {

					queue.offer(data.get(a).get(i));
					check[data.get(a).get(i)] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= n; i++) {
			data.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			data.get(a).add(b);
			data.get(b).add(a);
		}

		DFS(0);
		System.out.println();
		check = new boolean[n + 5];

		BFS();

	}

}
