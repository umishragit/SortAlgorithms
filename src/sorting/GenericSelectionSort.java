package sorting;

public class GenericSelectionSort<T extends Comparable<? super T>> {

	private T[] array;
	private int ARR_LENGTH = 0;
	
	
	public GenericSelectionSort(T[] array){
		this.array = array.clone();
		this.ARR_LENGTH = this.array.length;
		sort();
	}
	
	public void sort() {
		
		for (int LAST_UNSORTED_INDEX =  ARR_LENGTH - 1; LAST_UNSORTED_INDEX > 0; LAST_UNSORTED_INDEX--) {
			int largest = 0;
			for (int i = 1; i <= LAST_UNSORTED_INDEX; i++) {
				if (array[i].compareTo(array[ largest ]) > 0) {
					largest = i;
				}
				swap(array,largest,LAST_UNSORTED_INDEX);
			}
			
		}
	}
	
	
	public void swap(T array[], int i , int j) {
		
		if (i == j)
			return;
	
		T temp = array[i];
		array[i] = array[ j ];
		array[ j ] = temp;
		
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
