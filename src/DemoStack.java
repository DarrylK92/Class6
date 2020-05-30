import java.util.ListIterator;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		
		//System.out.println(stk.peek());
		
		ListIterator<Integer> lIt = stk.listIterator();
		while(lIt.hasNext()) {
			System.out.print(lIt.next() + " ");
		}
		System.out.println();
		
		System.out.println(stk.search(3));
		
		//violation
		lIt = stk.listIterator(2);
		System.out.println(lIt.next());
		
//		while(!stk.empty()) {
//			stk.pop();
//		}
		
		System.out.println(stk);
	}

}
