
public class Arrays2D {
	public static void main(String[] args) {
	int[][] lotteryCard = {{20, 15, 7},
						   {11, 19, 27},
						   {32, 17, 91}};
	System.out.println(lotteryCard[1][1]);
	
	int[][] lotteryCard2 = new int [3][3]; //[row][column]
	lotteryCard2[0][0]=20;
	lotteryCard2[0][1]=15;
	lotteryCard2[0][2]=7;
	lotteryCard2[1][0]=11;
	lotteryCard2[1][1]=19;
	lotteryCard2[1][2]=27;
	lotteryCard2[2][0]=32;
	lotteryCard2[2][1]=17;
	lotteryCard2[2][2]=91;
	
	System.out.println("--------------------- \n \n Printing the entire lotteryCard rowwise:");
	
	//increments by 1, then enters the next loop, 
	//and after completion of next loop it comes back and increments by 1 again
	//this process repeats itself until the condition set on this for loop is met
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++) {// increments by 1, and loops till completion of condition
		System.out.println(lotteryCard[i][j]); //prints the lotteryCard array in a row-wise manner
		}
	}
	}
}
