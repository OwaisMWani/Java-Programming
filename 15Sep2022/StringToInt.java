
public class StringToInt {
	public static void main(String[] args) {
		String s = "55"; //Creating the String
		int a = Integer.parseInt(s); //Converting String s to integer and storing the value in variable a
		System.out.println(s+4);//s is a string, using the + operator appends 4 to the given string
		System.out.println(a+4);//a is in integer form, so the + operator acts as an addition operator here
		
		System.out.println(Integer.parseInt("99")+1);//Converting String "99" to integer and adding 1 gives 100
		System.out.println("99"+1);//Trying to add one to string "99" results in 991
		
		String p = "age: 19";
		p = p.replaceAll("\\D+","");//Removing all values other than numbers from the string p
		int n = Integer.parseInt(p);
		System.out.println(n+33);
	}
}
