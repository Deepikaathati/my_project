package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamapi4 {
	public static void main(String[] args) {
	List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5); 
	List<Integer> uniqueNumbers = numbersWithDuplicates 
	.stream() 
	.distinct() 
	.collect(Collectors.toList());
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9); 
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10); 
		List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()) 
		.sorted() 
		.collect(Collectors.toList());
	}
}

