
public class Arrays {
	public static void main(String[] args) {
		System.out.println("Welcome to the zombie extermination! \n");
		String backpack[] = {"Shotgun","Rifle","Sniper"};
		String zombies[]= {"Baby Zombie","Normal Zombie","Mega Zombie"};
		System.out.println("Back Pack Items:");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]+"\n");
		
		System.out.println("Zombie Types:");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]+"\n");
		
		System.out.println("Number of backpack items and types of zombies: ");
		System.out.println(backpack.length+" items");
		System.out.println(zombies.length+" zombies");
	}
}
