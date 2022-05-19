package genericPkg;

import java.util.Random;
import java.util.Scanner;

public class FColorChoice{
	
	public static void execute()
	{
	    int correct = 0, incorrect = 0;
	    for(int i = 1; i <= 10; i++)
	    {
	        if(userColorChoice().equalsIgnoreCase(computerColorChoice()))
	            correct++;
	        else
	            incorrect++;
	    }
	    System.out.println("Amount of times you guessed correctly: " + correct);
	    System.out.println("Amount of times you guess incorrectly: " + incorrect);
	}
	
	public static String userColorChoice()
	{
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Choose either red, green, blue, orange or yellow! ");
	    String userColorChoice = keyboard.nextLine();
	    System.out.println("You chose: " + userColorChoice);
	    return userColorChoice;
	}

	public static String computerColorChoice()
	{
	    String randomColor;
	    int randomNumber;
	
	    Random random = new Random();
	    randomNumber = random.nextInt(4);
	
	    switch (randomNumber)
	    {
	        case 0:
	            randomColor = "Red";
	            break;
	        case 1:
	            randomColor = "Green";
	            break;
	        case 2:
	            randomColor = "Blue";
	            break;
	        case 3:
	            randomColor = "Orange";
	            break;
	        case 4:
	            randomColor = "Yellow";
	            break;
	        default:
	            randomColor = " ";
	    }
	    System.out.println("The computer chose: " + randomColor);
	    return randomColor;
	}
}