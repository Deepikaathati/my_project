package collections;

import java.util.Comparator;
import java.util.TreeSet;

//duplicates are not allowed
// maintain ordered sequence of elements
public class TreeSetDemo {

	public static void main(String[] args) {
		// Treeset<Integer> ts= new TreeSet<>();
		TreeSet<Integer> hs = new TreeSet<>(Comparator.reverseOrder());
		hs.add(100);
		hs.add(300);
		hs.add(500);
		hs.add(200);
		hs.add(400);
		System.out.println(hs);

		// Treeset<String> ts= new TreeSet<>();
		TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
		ts.add("Java");
		ts.add("Angular");
		ts.add("Python");
		ts.add("React");
		System.out.println(ts);

		// Traversal
		for (String course : ts) {
			System.out.println(course);
		}
		for (int price : hs) {
			System.out.println(price);
		}
	}
}
