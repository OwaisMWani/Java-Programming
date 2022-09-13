public class D_Bool {
	public static void main(String[] args) {
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
	
		if(passedDoor){
			System.out.println("You passed the first door!");
			doorCount = doorCount + 1;
		}
		if(passedDoor) {
			System.out.println("You passed the second door!");
			doorCount = doorCount + 1;
		}
		if(passedDoor){
			System.out.println("You passed the third door!");
			doorCount = doorCount + 1;
		}
		System.out.println("You passed "+doorCount+" doors!");
	
		if(doorCount<3) {
			System.out.println("You lost!");
		}
		if(doorCount==3) {
			passedAllDoors = true;
		}
		if(passedAllDoors){
			System.out.println("You won, Congratulations!");
		}
	}
}