import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * FIFO cache
 */
class FIFOCACH {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		int faults = 0;
		Deque<Integer> cache = new ArrayDeque<>(size);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (!cache.contains(x)) {
				faults++;
				if (cache.size() == size) {
					cache.removeFirst();
				}
				cache.addLast(x);
			}
		}
		System.out.println(faults);
	}

}
