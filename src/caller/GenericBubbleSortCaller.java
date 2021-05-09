package caller;

import java.util.Arrays;

import sorting.GenericBubbleSort;

public class GenericBubbleSortCaller {
   public static void main(String[] args) {
	   
	  Character[] charArr = {'v', 'h', 'c', 'o', 'e', 'u', 'z', 'a', 'q', 'i'};
	 
	  GenericBubbleSort<Character> bs1 = new GenericBubbleSort<Character>(charArr);
	  bs1.print();
	  
	  Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54, -3};
	  GenericBubbleSort<Integer> bs2 = new GenericBubbleSort<Integer>(intArr);
	  bs2.print();
	  
   }
}
