import java.util.PriorityQueue;

public class Hospital {

	public static void main(String[] args) {
		//create patients
		Patient jake = new Patient("Jake", "broken arm", 2);
		Patient adam = new Patient("Adam", "broken toe", 3);
		Patient peter = new Patient("Peter", "headache", 6);
		Patient kevin = new Patient("Kevin", "bullet wounds", 1);
		Patient veronica = new Patient("Veronica", "small cut", 4);
		Patient tom = new Patient("Tom", "stomach ache", 5);
		
		//create and fill priorityQueue
		PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
		pq.add(jake);
		pq.add(adam);
		pq.add(peter);
		pq.add(kevin);
		pq.add(veronica);
		pq.add(tom);
		
		//print priorityQueue contents and remove treated patients till the priorityQueue is empty
		while(pq.size() > 0) {
			System.out.println(pq);
			pq.remove();
		}
		
		//print priorityQueue to show it is empty
		System.out.println(pq);
	}

}
