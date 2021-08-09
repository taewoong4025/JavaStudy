package classStudy;

public class Student {
	String name;
	int number;
	String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNubmer(int nubmer) {
		this.number = nubmer;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+"\n"+"학번: "+number+"\n"+"소속학과: "+department;
	}

}
