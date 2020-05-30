import java.util.PriorityQueue;

public class StudentTest {

	public static void main(String[] args) {
		Student chris = new Student(1, "Chris", 4.0);
		Student tim = new Student(2, "Tim", 0.2);
		Student hawnli = new Student(3, "Hawnli", 3.0);
		Student kevin = new Student(4, "Kevin", 2.1);
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		pq.add(chris);
		pq.add(tim);
		pq.add(hawnli);
		pq.add(kevin);
		
		System.out.println(pq);
		
		pq.remove();
		
		System.out.println(pq);
		
		pq.remove();
		
		System.out.println(pq);
	}

}
