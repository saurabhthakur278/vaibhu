package vaibhu.vaibhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
	
//		ArrayList<Integer> l1=new ArrayList<>();
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		l1.add(50);
//		l1.add(40);
		
//		List<Integer> li = Arrays.asList(10,25,30,40,50);
//		List<Object> evenno=new ArrayList<>();
//		
////		for(int n: li) {
////			if (n%2==0) {
////				evenno.add(n);
////			}
////	
////		
////		}
//            evenno= li.stream().filter(n->n%2==0).collect(Collectors.toList());
////		.collect(collector.list)
//	System.out.println(evenno);
////		
//		List<String> li = Arrays.asList("qwwedsaxd","aaaaa","ddddd","vvvvv");
//	List<String> evenno=new ArrayList<>();
//	
////	evenno=li.stream().filter(str->str.length()>4 && str.length()<7).collect(Collectors.toList());
////	System.out.println(evenno);
////	
////	li.stream().filter(str->str.length()>4 && str.length()<7).forEach(str->System.out.println(str));
//		
//	
//	li.stream().filter(str->str.length()>4 && str.length()<7).forEach(System.out::println);

		
		List<Integer> lst1 = Arrays.asList(10,11);
		List<Integer> lst2 = Arrays.asList(12,13);
		List<Integer> lst3 = Arrays.asList(14,15);
		
		List<List<Integer>> li=Arrays.asList(lst1,lst2,lst3);
		
		li.stream().flatMap(x->x.stream()).forEach(System.out::println);;
		
		//System.out.println(finalint);
		
//		
//		
//		  List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
//          
//	        // Creating a list of Odd Numbers
//	        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
//	          
//	        // Creating a list of Even Numbers
//	        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
//	  
//	        List<List<Integer>> listOfListofInts =
//	                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
//	  
//	        System.out.println("The Structure before flattening is : " +
//	                                                  listOfListofInts);
//	          
//	        // Using flatMap for transformating and flattening.
//	        List<Integer> listofInts  = listOfListofInts.stream()
//	                                    .flatMap(list -> list.stream())
//	                                    .collect(Collectors.toList());
//	  
//	        System.out.println("The Structure after flattening is : " +
//	                                                         listofInts);
//	    
	
		
	}

}
