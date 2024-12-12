package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55, 77, 66, 44, 11, 99);
		System.out.println(list);

		// collections.sort(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);

		int[] arr = { 55, 77, 66, 44, 11, 99 };
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.binarySearch(arr, 44));
		System.out.println(Arrays.binarySearch(arr, 66));
		System.out.println(Arrays.binarySearch(arr, 100));

	}

}
