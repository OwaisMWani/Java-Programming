
public class Polymorphism {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.speak();
		cat.speak();
	}
}
	class Cat{
		String speak;
		void speak() {
			String s="meow";
			System.out.println(s);
		}
	}
	class Dog{
		void speak(){
		String s="woof";
		System.out.println(s);
		}
		
	}

