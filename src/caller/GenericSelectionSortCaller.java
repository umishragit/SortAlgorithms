package caller;

import java.util.Arrays;

import sorting.GenericBubbleSort;
import sorting.GenericSelectionSort;

public class GenericSelectionSortCaller {
   public static void main(String[] args) {
	   
	  Character[] charArr = {'v', 'h', 'c', 'o', 'e', 'u', 'z', 'a', 'q', 'i'};
	 
	  GenericSelectionSort<Character> bs1 = new GenericSelectionSort<Character>(charArr);
	  bs1.print();
	  
	  Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54, -3};
	  GenericSelectionSort<Integer> bs2 = new GenericSelectionSort<Integer>(intArr);
	  bs2.print();
	  
   }
}
