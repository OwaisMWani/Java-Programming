import java.util.HashMap;
import java.util.Scanner;

public class HashMaps{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a = 33;
		String b = "A";
		int c = 9;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put(b,a);
		hm.put("B",c);
		System.out.println("HashMap before removing any value:");
		System.out.println(hm);
		System.out.println();
		System.out.println("Do you want to remove A or B?");
		String s=scan.nextLine();
		switch(s){
		case "a":
			hm.remove("A");
			System.out.println();
			System.out.println("HashMap after removing A:");
			System.out.println(hm);
			break;
		case "b":
			hm.remove("B");
			System.out.println();
			System.out.println("HashMap after removing B:");
			System.out.println(hm);
			break;
		case "A":
			hm.remove("A");
			System.out.println();
			System.out.println("HashMap after removing A:");
			System.out.println(hm);
			break;
		case "B":
			hm.remove("B");
			System.out.println();
			System.out.println("HashMap after removing B:");
			System.out.println(hm);
			break;
		default:
			System.out.println("Invalid input");
		}
	scan.close();
	}
}
