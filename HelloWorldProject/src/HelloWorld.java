/*
 * TODO: Owen Girimonte
 * TODO: 9/17/2024
 * TODO: 7
 * TODO: Binary Conversion Program
 */
import java.util.Scanner;
 public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean rerun = true;
		while (rerun){
			System.out.println("Welcome!  You have the following options:");
			System.out.println("1. Binary to Decimal");
			System.out.println("2. Decimal to Binary");
			System.out.print("Which type of conversion would you like to perform?");
			int choice = input.nextInt();
			while (choice!=1 && choice!=2){
				System.out.print("Which type of conversion would you like to perform?");
				choice = input.nextInt();
			}
			if (choice==1){
				System.out.println("What is the binary number?");
				int binary = input.nextInt();
				int power = 0;
				int decimal = 0;
				while (binary>0){
					if (binary%10==0){
						decimal+= Math.pow(2,power);
					}
					binary/=10;
					power++;
				}
				System.out.println("The decimal equivalent is: "+decimal);
			}
			if (choice==2){
				int decimal = 0;
				String binary = "";
				System.out.println("What is the decimal number?");
				decimal = input.nextInt();
				while (decimal>0){
					binary = (decimal%2)+binary;
					decimal/=2;
				}
				System.out.println("The binary equivalent is: "+binary);
			
			}
			
			System.out.println("Do you want to continue - yes or no?");
			String var = input.nextLine();
			if (var.equals("no"))
				rerun = false;
			else 
				rerun = true;
			
		}
		input.close();
	}

}
