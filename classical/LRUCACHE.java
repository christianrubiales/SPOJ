import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LRUCACHE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		int faults = 0;
		Deque<Integer> list = new ArrayDeque<>();
		Set<Integer> cache = new HashSet<>();
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (!cache.contains(x)) {
				faults++;
				if (cache.size() == size) {
					cache.remove(list.removeLast());
				}
				list.addFirst(x);
				cache.add(x);
			} else {
				list.remove(x);
				list.addFirst(x);
			}
		}
		System.out.println(faults);
	}
}
