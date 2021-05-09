package caller;

import java.util.Arrays;

import sorting.GenericBubbleSort;
import sorting.GenericInsertionSort;
import sorting.GenericSelectionSort;

public class GenericInsertionSortCaller {
   public static void main(String[] args) {
	   
	  Character[] charArr = {'v', 'h', 'c', 'o', 'e', 'u', 'z', 'a', 'q', 'i'};
	 
	  GenericInsertionSort<Character> bs1 = new GenericInsertionSort<Character>(charArr);
	  bs1.print();
	  
	  Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54, -3};
	  GenericInsertionSort<Integer> bs2 = new GenericInsertionSort<Integer>(intArr);
	  bs2.print();
	  
   }
}
