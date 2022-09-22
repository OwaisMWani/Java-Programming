class Student{
	String name;
	int grade;
	public Student setName(String name) {
		this.name=name;
		return this;
	}
	public Student setGrade(int grade) {
		this.grade=grade;
		return this;
	}
}

public class MethodChaining {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setGrade(99).setName("Owais"); //Method chaining
		System.out.println(s1.name);
		System.out.println(s1.grade);
	}
}
