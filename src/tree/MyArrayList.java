package tree;

public class MyArrayList<E> {

	final int CAPACITY = 10;
	
	 E[] arr =null;
	 
	 int size;
	 
	 int newCapacity = 0;
	
	MyArrayList(){
		arr =(E[]) new Object[CAPACITY];
	}
	
	
	void set(int index,E e) {
		arr[index] = e;
	}
	
	void add(E e) {
		if(size==CAPACITY || size==arr.length) {
			newCapacity = size+(size >> 1);
			E[] array =(E[]) new Object[newCapacity];
			System.arraycopy(arr, 0,array, 0, arr.length);
			arr= array;
		}
		
		arr[size++]=e;
	}
	
	void add(int index,E e) {
		if(size==CAPACITY || size==arr.length) {
			newCapacity = size+(size >> 1);
			E[] array =(E[]) new Object[newCapacity];
			System.arraycopy(arr, 0,array, 0, arr.length);
			arr= array;
		}
		System.arraycopy(arr, index, arr, index+1, size-index);
		arr[index]=e;
		size++;
	}
	
	
	int size() {
		return size;
	}
	
	public static void main(String args[]) {
		
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(671);
		list.add(672);
		list.add(673);
		list.add(674);
		list.add(675);
		list.add(676);
		list.add(677);
		list.add(678);
		list.add(679);
		list.add(670);
		list.add(167);
		list.add(267);
		list.add(367);
		list.add(7, 5667);
		
		System.out.println("");
		
	}
	
	void remove(int index) {
		
		
	}
	
	
}
