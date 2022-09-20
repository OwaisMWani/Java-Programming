abstract class Dog{
	String breed;
	Dog(String breed){
		this.breed=breed;
	}
	public void bark() { //This method cannot be used directly from the abstract class, and needs a child class in order to be used in other classes 
		System.out.println("woof");
	}
	public abstract void sit();// an abstract method has to be implemented by every class that inherits it
}//Unlike and interface, an abstract class can have both implemented and abstract methods whereas interfaces only have abstract methods

class Chihuahua extends Dog{ //Making a child class of an abstract class in order to use the functionality from abstract class Dog
	public void sit() {
		System.out.println(breed+" Sits");
	}
	Chihuahua(String breed){
		super(breed);
	}
}

public class Abstraction{
	public static void main(String[] args) {
		Chihuahua c=new Chihuahua("Chihuahua");//Calling the bark method through the child class of the abstract class
		c.bark();
		System.out.println("The Dog's Breed is: "+ c.breed);
		c.sit();
	}
}
