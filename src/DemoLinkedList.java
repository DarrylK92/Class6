import java.util.ArrayList;
import java.util.*;

public class DemoLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(22);
		arrList.add(19);
		arrList.add(99);
		System.out.println(arrList);
		Iterator it = arrList.iterator();
		/*System.out.println(it);
		System.out.println(it.next());
		it.remove();
		System.out.println(arrList);*/
		
		//print out the items from the list using iterator
		for(Iterator i = arrList.iterator(); i.hasNext(); ) {
			System.out.println(i.next());
		}
		
		LinkedList<Object> linkedList = new LinkedList<>(arrList);
		System.out.println(linkedList);
		linkedList.add("black");
		linkedList.add("red");
//		System.out.println(linkedList);
//		linkedList.remove(4);
		System.out.println(linkedList);
		linkedList.addFirst("white");
		System.out.println(linkedList);
		
		//listIterator
		ListIterator<Object> lIt = linkedList.listIterator();
		while(lIt.hasNext()) {
			System.out.print(lIt.next() + " ");
		}
		
		System.out.println("");
		
		//what about printing the list backwards?
		lIt = linkedList.listIterator(linkedList.size());
		while(lIt.hasPrevious()) {
			System.out.print(lIt.previous() + " ");
		}
	}

}
