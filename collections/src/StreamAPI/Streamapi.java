package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
    //Find the longest string in a list of strings using Java streams
public class Streamapi {
	public static void main(String[] args) {
	List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit"); 
	Optional<String> longestString = strings 
	.stream() 
	.max(Comparator.comparingInt(String::length)); 
}
	System.out.println(longeststring);
	
}