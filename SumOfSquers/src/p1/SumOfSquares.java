package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfSquares {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(1,2,3,4,5);
		int sumOfSquares=number.stream()
				               .map(n -> n * n)
				               .peek(System.out::println)
				               .reduce(0, Integer::sum);
		System.out.println(sumOfSquares);
		
//		List<Integer> number1=Arrays.asList(1,2,3);
//	          int  squares=number1.stream().map(n->n*n)
//				                    .peek(System.out::println)
//				                    .reduce(0, Integer::sum);
//		System.out.println(squares);
		                            

	}

}
