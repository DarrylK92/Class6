
public class Patient implements Comparable<Patient> {
	String name;
	String condition;
	Integer priority;
	
	//constructor
	public Patient(String n, String c, int p) {
		name = n;
		condition = c;
		priority = p;
	}

	//getters
	public String getName() {
		return name;
	}

	public String getCondition() {
		return condition;
	}
	
	public Integer getPriority() {
		return priority;
	}

	//setters
	public void setCondition(String c) {
		condition = c;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPriority(int p) {
		priority = p;
	}
	
	//toString
	public String toString() {
		return ("Name: " + getName() + " Condition: " + getCondition() + " Priority: " + getPriority());
	}

	//compare priorities
	public int compareTo(Patient other) {
		return (this.getPriority().compareTo(other.getPriority()));
	}
}
