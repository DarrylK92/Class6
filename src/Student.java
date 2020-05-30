
public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double gpa;
	
	//constructor
	public Student(int i, String n, double g) {
		id = i;
		name = n;
		gpa = g;
	}
	
	//getter
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	//setter
	public void setId(int i) {
		id = i;
	}

	public void setName(String n) {
		name = n;
	}

	public void setGpa(double g) {
		gpa = g;
	}
	
	//toString
	public String toString() {
		return ("ID: " + getId() + " Name: " + getName() + " has a GPA of " + getGpa());
	}

	public boolean equals(Student other) {
		return name.equals(other.getGpa());
	}
	
	public int compareTo(Student other) {
		//if (this.equals(other)) {
			//return 0;
		return (this.getName().compareTo(other.getName()));
			//return 1;
//		} else {
//			return -1;
//		}
	}
}
