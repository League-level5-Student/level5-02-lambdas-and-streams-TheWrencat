package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.substring(s.length() -  i - 1, s.length()  - i));
			}
			System.out.println("\n");
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				Random r = new Random();
				int temp = r.nextInt(2);
				if(temp == 0) {
					
					System.out.print(s.toLowerCase().substring(i, (i+1)));
				}else {
					System.out.print(s.toUpperCase().substring(i, (i+1)));
				}				
			}
			System.out.println("\n");
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.substring(i, i+1) + ".");
			}
			System.out.println("\n");
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if(!s.substring(i, i+1).equals("a") && !s.substring(i, i+1).equals("e")) {
				System.out.print(s.substring(i, i+1));
				}
			}
			System.out.println("\n");
		}, "repeat");
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
