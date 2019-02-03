package CF_536;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//D. Lunar New Year and a Wander
public class D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer e1, Integer e2) {
				return e1 < e2 ? 1 : 0;
			}
		};
		List<Integer> seq = new ArrayList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean[] isVisited = new boolean[n + 1];
		List<Integer>[] adj = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			if (u == v) {
				continue;
			}
			adj[u].add(v);
			adj[v].add(u);
		}
		for (int i = 1; i <= n; i++) {
			isVisited[i] = false;
			adj[i].sort(comparator);
		}

		isVisited[1] = true;
		pq.add(1);
		while (!pq.isEmpty()) {
			int now = pq.poll();
			seq.add(now);
			for (int e : adj[now]) {
				if (!isVisited[e]) {
					pq.add(e);
					isVisited[e] = true;
				}
			}
		}
		for (int i = 0; i < seq.size(); i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(seq.get(i));
		}
		scan.close();
	}
}
