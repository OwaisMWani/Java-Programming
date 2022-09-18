import java.util.Scanner;

public class GettersSetters {
	public static void main(String[] args) {
		MakeAccount account=new MakeAccount();
		account.createAcc();
	}
}

class MakeAccount{
	public void createAcc(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String a=scan.nextLine();
		System.out.println("Enter your age: ");
		int b=scan.nextInt();
		scan.close();
		System.out.println();
		Account account=new Account();
		account.setName(a);//Passing String a as the parameter for setName method, this results in the name being set to whatever string is passed through String a
		account.setAge(b);//Passing int b as the parameter for setAge method, this results in the age being set to whatever integer is passed through int b
		System.out.println("Name: "+account.getName());//we use getName method to return the String in name
		System.out.println("Age: "+account.getAge());//we use getAge method to return the value of age
	}
}

class Account{
	String name;
	int age;
	public void setName(String name) {
		this.name=name; //changes the String to whatever parameter is passed through
	}
	public void setAge(int age) {
		this.age=age;//changes the integer to whatever parameter is passed through it
	}
	public String getName() {
		return this.name;//this method returns the String stored in name
	}
	public int getAge() {
		return this.age;//this method returns the integer stored in age
	}
}

