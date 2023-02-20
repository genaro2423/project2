package hermanaEvelyn;

import java.util.Scanner;

public class GenderTax {

	public static void main(String[] args) {
		
		final double rate1 = 0.20;
		final double rate2=0.25;
		double tax;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter 1 or 2");
		int status = input.nextInt();
		
		if(status==1) {
			System.out.println("Enter your income: ");
			double income = input.nextDouble();
			System.out.println("Your tax is: " +rate1*income);
		}
		else if(status==2) {
			System.out.println("Enter your income: ");
			double income = input.nextDouble();
			System.out.println("Your tax is: " +rate2*income);
		}
		else 
			{System.out.println("Number provided is incorrect, enter 1 for single or 2 for married");
			}
	}
	
}
