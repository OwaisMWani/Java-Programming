import java.util.Scanner;
interface WaterBottle1{
	String color = "Blue";
	//Interfaces don't have constructors
	//The following lines of code wouldn't work as only abstract methods are allowed inside interface
	/*	void fillUp() {
	 *	System.out.println("The bottle is filled with water!");
	}*/
	void fillUp();//Abstract Method(Undefined method)
	default void emptyBottle() { //The only way to make a method body inside an interface is to change the method to default or to change it to static
		System.out.println("\nThe bottle is empty!");//Example of a default method body inside an interface
	}
}
interface WaterBottle2{
	public static void drinkWater() { //Example of a static method body inside an interface
		System.out.println("\nYou drank the water!");
	}
}
class WaterBottle implements WaterBottle1,WaterBottle2{
	@Override
	public void fillUp() {
		System.out.println("\nThe bottle is filled with water!");
	}
	public void waterBottle() {
		System.out.println("\nYou just picked up a water bottle. Its color is "+color+"!");
		System.out.println("\nDo you want to fill your bottle with water?(y/n)");
		Scanner scan=new Scanner(System.in);
		String a = scan.nextLine();
		switch(a) { 
			case "n":
				System.out.println("\nThank you for picking the water bottle up!");
				scan.close();
				System.exit(0);
			case "y":
				while(true){
					fillUp();
					System.out.println("\nDo you want to drink the water?(y/n)");
					String b = scan.nextLine();
					switch(b) { 
				
						case "n":
							System.out.println("\nThank you for filling the water bottle!");
							scan.close();
							System.exit(0);
							
						case "y":
							while(true){
							//pourWater();  you can't call this method from interface directly as it is static type
							WaterBottle2.drinkWater();//calling static method from an interface by mentioning the name of the interface
							emptyBottle();
							break;
							}
					
						default:
					}
				System.out.println("\nDo you want to fill the bottle with water again?(y/n)");
				String c = scan.nextLine();
				switch(c) {
					case "n":
						System.out.println("\nThank you for drinking from the water bottle!");
						scan.close();
						System.exit(0);
					case "y":
				}
			}
		}
		scan.close();
	}
}

public class JavaInterface extends WaterBottle {
	public static void main(String[] args) {
		WaterBottle water=new WaterBottle();
		water.waterBottle();
	}
}
