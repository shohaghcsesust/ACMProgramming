package CF_536;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//B. Lunar New Year and Food Ordering
public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = scan.nextInt();
		}
		int[] c = new int[n + 1];
		Comparator<Canteen> canteenComparator = new Comparator<Canteen>() {
			@Override
			public int compare(Canteen e1, Canteen e2) {
				if (e1.cost == e2.cost) {
					return e1.pos - e2.pos;
				}
				return e1.cost - e2.cost;
			}
		};
		PriorityQueue<Canteen> pq = new PriorityQueue<Canteen>(canteenComparator);
		for (int i = 1; i <= n; i++) {
			c[i] = scan.nextInt();
			pq.add(new Canteen(i, a[i], c[i]));
		}
		Canteen cheapestCanteen = null;
		for (int i = 0; i < m; i++) {
			int t = scan.nextInt();
			int d = scan.nextInt();
			long res = 0;
			if (a[t] >= d) {
//				System.out.println("1->"+t+":"+a[t]+":"+c[t]+","+d);
				res = (long)c[t] * d;
				a[t] -= d;
				d = 0;
			} else {
				if (a[t] > 0) {
//					System.out.println("2->"+t+":"+a[t]+":"+c[t]+","+d);
					res = (long)a[t] * c[t];
					d -= a[t];
					a[t] = 0;
				}

				if (cheapestCanteen != null) {
					cheapestCanteen.ingrediant = a[cheapestCanteen.pos];
					if (cheapestCanteen.ingrediant >= d) {
//						System.out.println("3->"+cheapestCanteen.toString());
						res += (long)d * cheapestCanteen.cost;
						cheapestCanteen.ingrediant -= d;
						a[cheapestCanteen.pos] -= d;
						d = 0;
					} else if (cheapestCanteen.ingrediant > 0) {
//						System.out.println("4->"+cheapestCanteen.toString());
						res += (long)cheapestCanteen.ingrediant * cheapestCanteen.cost;
						d -= cheapestCanteen.ingrediant;
						cheapestCanteen.ingrediant = 0;
						a[cheapestCanteen.pos] = 0;
					}
				}
				while (d > 0 && !pq.isEmpty()) {
					Canteen canteen = pq.poll();
//					System.out.println("5->"+canteen.toString());
					if (canteen.pos == t) {
						continue;
					}
					canteen.ingrediant = a[canteen.pos];
					if (canteen.ingrediant >= d) {
						res += (long)d * canteen.cost;
						canteen.ingrediant -= d;
						a[canteen.pos] -= d;
						cheapestCanteen = canteen;
						d = 0;
//						pq.add(canteen);
					} else {
						if (canteen.ingrediant > 0) {
							res += (long)canteen.ingrediant * canteen.cost;
							d -= canteen.ingrediant;
							canteen.ingrediant = 0;
							a[canteen.pos] = 0;
						}
					}
//					System.out.println("res:" + res);
				}
			}
			if (d > 0)
				res = 0;
			System.out.println(res);
		}
		pq.clear();
		scan.close();
	}
}

class Canteen {
	int pos;
	int ingrediant;
	int cost;

	Canteen(int pos, int ingrediant, int cost) {
		this.pos = pos;
		this.ingrediant = ingrediant;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "pos:" + pos + ",ingrediant:" + ingrediant + ",cost:" + cost;
	}
}
