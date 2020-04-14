package myfirstproject;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double milkPrice = 3.27;
		double eggsPrice = 2.99;
		double wallet1 = 54.32;
		double wallet2 = 257.85;
		int numberOfFriends = 90;
		int numberOfFriends2 = 500;
		int ageInYears1 = 18;
		int ageInYears2 = 50;
		String firstName = "Skyler";
		String firstName2 = "Nicholas";
		String lastName = "Suwyn";
		String lastName2 = "Suwyn";
		char middleInitial = 'A';
		char middleInitial2 = 'A';
		
		double moneyLeft1Milk = wallet1 - milkPrice;
		double moneyLeft1Eggs = wallet1 - eggsPrice;
		double moneyLeft2Milk = wallet2 - milkPrice;
		double moneyLeft2Eggs = wallet2 - eggsPrice;
		
		int friendsPerYears = numberOfFriends  / ageInYears1;
		int friendsPerYears2 = numberOfFriends2 / ageInYears2;
		
		String fullName1 = firstName + " " + middleInitial + " " + lastName;
		String fullName2 = firstName2 = " " + middleInitial2 + " " + lastName2;
		
		System.out.println("Hello my name is " +fullName1);
		System.out.println("I have made " + friendsPerYears + " friends every year of my life.");
		System.out.println("I had some money but I bought eggs, now I have " + moneyLeft1Eggs );
		System.out.println("If I had boughten milk instead I would've had " + moneyLeft1Milk);
		
		System.out.println("Hello my name is " +fullName2);
		System.out.println("I have made " + friendsPerYears2 + " friends every year of my life.");
		System.out.println("I had some money but I bought eggs, now I have " + moneyLeft2Eggs );
		System.out.println("If I had boughten milk instead I would've had " + moneyLeft2Milk);
		
	}

}
