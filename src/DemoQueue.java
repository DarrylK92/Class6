import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<Integer> nums = new LinkedList<Integer>();
		for(int i = 1; i < 10; i++) {
			nums.add(i);
		}
//		nums.add(1);
//		nums.add(2);
//		nums.offer(3);
//		nums.offer(4);
		System.out.println(nums);
		System.out.println("removed: " + nums.poll());
		System.out.println("peek: " + nums.peek());
		
		//can not use listIterator for queues
		Iterator it = nums.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}

}
