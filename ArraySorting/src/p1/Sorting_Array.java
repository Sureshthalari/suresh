package p1;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		String[] courses= {"java","python","Angular"};
		int[] num= {2,7,3,9,6,1};
		Arrays.sort(num);
		Arrays.sort(courses);
		for(String i:courses) {
			System.out.println(i);
		}
		for(int i:num) {
			System.out.println(i);
		}

	}

}
