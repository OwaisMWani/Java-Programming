import java.util.*;

public class A_scannertut{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter pokemon 1:");
	String pokemon1 = scan.nextLine();
	System.out.println("Enter pokemon 2:");
	String pokemon2 = scan.nextLine();
	System.out.println("Enter pokemon 3:");
	String pokemon3 = scan.nextLine();
	System.out.println("Enter pokemon 4:");
	String pokemon4 = scan.nextLine();
	System.out.println("Enter pokemon 5:");
	String pokemon5 = scan.nextLine();
	System.out.println("Enter pokemon 6:");
	String pokemon6 = scan.nextLine();
	System.out.println("Enter your rank:");
	int level = scan.nextInt();
	scan.close();
	
	System.out.println("Here are your pokemon:\n");
	System.out.println("Your first pokemon is " + pokemon1);
	System.out.println("\nYour second pokemon is " + pokemon2);
	System.out.println("\nYour third pokemon is " + pokemon3);
	System.out.println("\nYour fourth pokemon is " + pokemon4);
	System.out.println("\nYour fifth pokemon is " + pokemon5);
	System.out.println("\nYour sixth pokemon is " + pokemon6);
	System.out.println("\nYour rank is " + level);
	}
}