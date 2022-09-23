class Information{
	private String name;//Making the data in the class private
	private int age;
	private String rollNo;
	public void setName(String name){ //These setter methods allow us to edit the data from another class
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setRoll(String rollNo){
		this.rollNo=rollNo;
	}
	public String getName(){//These getter methods return the value for access in another class
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getRoll(){
		return rollNo;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Information a=new Information();
		a.setName("Owais"); //Changing data that is private through setters
		a.setAge(19);
		a.setRoll("B3678A");
		System.out.println("Name: "+a.getName()); //Printing private data through getters
		System.out.println("Age: "+a.getAge());
		System.out.println("Roll No: "+a.getRoll());
	}
}
