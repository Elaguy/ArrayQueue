package schultz.university.codinga2;

public class ArrayQueue {

	private int[] data;
	private int front;
	private int size;
	
	public ArrayQueue() {
		data = new int[10];
		front = 0;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int element) {
		if(((front + size) % data.length) == front && size > 0)
			System.out.println("Cannot enqueue, queue is full!");
		
		else {
			int index = (front + size) % data.length;
			data[index] = element;
			size++;
		}
	}
	
	public int dequeue() {
		if(isEmpty())
			return -1;
		
		int result = data[front];
		
		front = (front + 1) % data.length;
		size--;
		
		return result;
	}
	
	public String toString() {
		if(isEmpty())
			return "Queue is empty!";
		
		String result = "";
		
		for(int i = front; i < front + size; i++)
			result += data[i] + " ";
		
		return result;
	}

}
