import java.util.*;

public class C_HypotenuseTheorem {
	public static void main(String[] args) {
		
		double adjacent;
		double opposite;
		double hypotenuse;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of adjacent:");
		adjacent = scan.nextDouble();
		System.out.println("Enter the length of opposite:");
		opposite = scan.nextDouble();
		scan.close();
		
		hypotenuse = Math.sqrt((adjacent*adjacent)+(opposite*opposite));
		System.out.println("The length of the hypotenuse is: "+hypotenuse);
	}
}