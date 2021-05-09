package sorting;

public class GenericInsertionSort<T extends Comparable<? super T>> {

	private T[] array;
	private int ARR_LENGTH = 0;
	
	
	public GenericInsertionSort(T[] array){
		this.array = array.clone();
		this.ARR_LENGTH = this.array.length;
		sort();
	}
	
	public void sort() {
		
		for (int FIRST_UNSORTED_INDEX =  1; FIRST_UNSORTED_INDEX < array.length; FIRST_UNSORTED_INDEX++) {
			
			T newElement = array[FIRST_UNSORTED_INDEX];
		
			int i;
			for(i = FIRST_UNSORTED_INDEX; i > 0 && (array[i - 1].compareTo(newElement) > 0); i--) {
				
				array[i] = array[i - 1];
			}
			array[i] = newElement;	
		}		
	}
	
	public void print() {
		System.out.print("[ ");
		for (T t : array) {
			System.out.print(t + " ");
		}
		System.out.print("]");
		System.out.println();
	}

	public T[] getArray() {
		return array;
	}

	
}
