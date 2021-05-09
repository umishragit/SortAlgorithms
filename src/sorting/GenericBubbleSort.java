package sorting;

public class GenericBubbleSort<T extends Comparable<? super T>> {

	private T[] array;
	private int ARR_LENGTH = 0;
	
	
	public GenericBubbleSort(T[] array){
		this.array = array.clone();
		this.ARR_LENGTH = this.array.length;
		sort();
	}
	
	public void sort() {
		
		for (int LAST_UNSORTED_INDEX =  ARR_LENGTH - 1; LAST_UNSORTED_INDEX > 0; LAST_UNSORTED_INDEX--) {
			for (int i = 0; i < LAST_UNSORTED_INDEX; i++) {
				
				if (array[i].compareTo(array[ i + 1 ]) > 0) {
					T temp = array[i];
					array[i] = array[ i + 1 ];
					array[ i + 1 ] = temp;
				}
			}
			
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
