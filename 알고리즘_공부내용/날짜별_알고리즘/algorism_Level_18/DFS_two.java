package algorism_Level_18;

//2»öÄ¥ÇÏ±â
import java.util.ArrayList;
import java.util.Scanner;

public class DFS_two {

	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();

	static ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();

	static int[] visit = new int[n + 5];

	static String flag = "YES";

	public static void DFS(int x) {

		for (int i = 0; i < data.get(x).size(); i++) {

			if (visit[data.get(x).get(i)] == 0 && visit[x] == 1) {
				visit[data.get(x).get(i)] = 2;
				DFS(data.get(x).get(i));
			} else if (visit[data.get(x).get(i)] == 0 && visit[x] == 2) {
				visit[data.get(x).get(i)] = 1;
				DFS(data.get(x).get(i));
			} else if ((visit[data.get(x).get(i)] == 1 && visit[x] == 1)
					|| (visit[data.get(x).get(i)] == 2 && visit[x] == 2)) {
				flag = "NO";
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
		visit[0] = 1;
		DFS(0);
		System.out.println(flag);
	}

}
