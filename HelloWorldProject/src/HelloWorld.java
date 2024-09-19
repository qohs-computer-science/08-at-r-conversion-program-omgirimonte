/*
 // Owen Girimonte
 // 9/17/2024
 // 7
 // Binary Conversion Program, 
 // asks user to either do a binary to decimal conversion or the other way around
 */
import java.util.Scanner;
 public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean rerun = true;
		//loop that continues to ask the user 
		while (rerun){
			// asks user what option they want
			System.out.println("Welcome!  You have the following options:");
			System.out.println("1. Binary to Decimal");
			System.out.println("2. Decimal to Binary");
			System.out.print("Which type of conversion would you like to perform?");
			int choice = input.nextInt();
			while (choice!=1 && choice!=2){
				System.out.print("Which type of conversion would you like to perform?");
				choice = input.nextInt();
			}// end while 
			// if the user wants binary to decimal
			if (choice==1){
				System.out.println("What is the binary number?");
				int binary = input.nextInt();
				int power = 0;
				int decimal = 0;
				// loop that goes through binay number converting it to a decimal
				while (binary>0){
					if (binary%10==1){
						decimal+= Math.pow(2,power);
					}// end if 
					binary/=10;
					power++;
				}// end while 
				System.out.println("The decimal equivalent is: "+decimal);
			}// end if 
			// if they chose decimal to binary
			if (choice==2){
				int decimal = 0;
				String binary = "";
				System.out.println("What is the decimal number?");
				decimal = input.nextInt();
				// loop that mods and divides decimal to make binary number
				while (decimal>0){
					binary = (decimal%2)+binary;
					decimal/=2;
				}// end if 
				System.out.println("The binary equivalent is: "+binary);
			}// end while 
			
			System.out.print("Do you want to continue - yes or no?\n");
			input.nextLine();

			String var = input.nextLine();
			if (var.equals("no"))
				rerun = false;
			else 
				rerun = true;
			

		}// end while
		input.close();
	}// end main

}//end class
