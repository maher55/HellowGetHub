import java.util.Scanner;

public class UserNames {

	public UserNames() {
		// TODO Auto-generated constructor stub
	}

	
	public static void WhatIsYourName() {
		// TODO Auto-generated method stub
		System.out.println("What is you name?");
		
		Scanner GetFromKeyBoard= new Scanner(System.in);
		
		
		System.out.println("Your name with Lower Case characters is: " + GetFromKeyBoard.next().toLowerCase());
		
		System.out.println("Would you please write your name again");
		System.out.println("Your name with capital case characters is " + GetFromKeyBoard.next().toUpperCase());
		System.out.println("What is your name again please :)");
		String userInput;
		String word = "Maher";

		
		 userInput = GetFromKeyBoard.next();
		 if (word.equals(userInput)) {
		     System.out.println("Hi Maher how are you man!");
		     }else{
		         System.out.println("Im sorry you dont have the permission to access that program " + userInput + "!" );
		         }
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatIsYourName();
	}

}
