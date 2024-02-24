import java.util.*;
class NumberGuessGame{
	public static void main(String[]args){
		Random num=new Random();
		int n=num.nextInt(100);
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Guess Number Game");
		System.out.println("You Will Be Asked To Guess A number To Win the Game");
		System.out.println("You Have Maximum 5Attempt Limit");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter A Guess Number Between 1 to 100");
			int a=scan.nextInt();
			if(a>n){
				System.out.println("Your Guess Number is Greater");
			}
			else if(a<n){
				System.out.println("Your Guess Number is Smaller");
		}
		else{
			System.out.println("OOhhOO Your Number is Correct. you Win the Game!");
			System.exit(0);
		}
	}
}
}
		
		
		
