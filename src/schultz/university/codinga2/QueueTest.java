package schultz.university.codinga2;

public class QueueTest {
	
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue);
		
		queue.dequeue();
		
		System.out.println(queue);
		
		queue.dequeue();
		
		System.out.println(queue);
		
		queue.dequeue();
		
		System.out.println(queue);
	}

}
