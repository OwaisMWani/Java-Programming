
public class MainMethod {
	/*public-> makes the method accessible throughout the class, and throughout the
	 *static-> makes the method remains static and not change throughout the program
	 *void  -> void return type is used when we don't want to return any value
	 *String[]-> String Array
	 *args -> arguments that are passed when the program is run
	*/
	public static void main(String[] args) { //hello and hey have been added as arguments
		System.out.println(args[1]);//arguments can be added under Run Configuration Tab 	(Eclipse)
		//To add args in a terminal, type: java <name of class containing main> <args>
		String[] s = {"hello","hi","hey"}; //Creating String Array s with 3 strings
		
		Method say=new Method();//Creating an object from the Method class
		say.saySomething(s);//Calling saySomething method
	}
}
	class Method{
	public void saySomething(String[] s){     //Creating saySomething method  
		System.out.println(s[0]+" "+s[1]+" "+s[2]);
	}
	
}
