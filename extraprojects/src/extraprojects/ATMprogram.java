package extraprojects;

import java.util.Scanner;

public class ATMprogram {

	public static void main(String[] args) {
		int pin = 6969;
		System.out.println("welcome");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your pin :");
		if (pin == sc.nextInt()) {
			atm();
		}else {
			System.out.println("wrong pin .");
			System.out.println("try again by removing "+ " and inserting the card again.");
		}
	     sc.close();
	}
   public static void atm() {
	   int balance = 100000;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("please enter desired operation : ");
	   String checker = sc.nextLine();
	   switch (checker) {
	   case "withdraw":{
		   System.out.println("please enter the amount : ");
		   balance -= sc.nextInt();
		   System.out.println("your balance is " + balance + ".");
		   break;
		   }
	   case "deposit":{
		   System.out.println("please enter the amount : ");
		   balance += sc.nextInt();
		   System.out.println("your balance is " + balance + ".");
		   break;
	   }
	   case "check balance":{
		   System.out.println("your balance is " + balance + ".");
		   break;
        }
        }
	   System.out.println("Thank you for visiting our bank " + ",please come back again.");
	   sc .close();
   }
}