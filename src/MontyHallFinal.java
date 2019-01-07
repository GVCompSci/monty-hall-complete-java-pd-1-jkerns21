
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Jonathan Kerns
 * Period 1
 *
 */

public class MontyHallFinal
{

	public static void main (String []args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many rounds of the game should be simulated: ");
		int rounds = keyboard.nextInt();
		while ((rounds < 10)||(rounds > 10000))
		{
			System.out.println("Must enter a number between 10 and 1000");
			rounds = keyboard.nextInt();
		}
		int rounds2 = rounds;
		System.out.println("Would you like to always switch or stay?");
		String option = keyboard.nextLine();
		while ((!option.equals("switch"))&&(!option.equals("stay")))
		{
			System.out.println("Must enter either 'switch' or 'stay'.");
			option = keyboard.nextLine();
		}
		int wins = 0;
		int loss = 0;
		while (option.equals("stay") && (rounds > 0))
		{
		Random rand = new Random();
		int door = rand.nextInt(3) + 1;
		int car = rand.nextInt(3) + 1;
		int goat = 0;
		
		if ((car == 1)&&(door == 1))
		{
			goat = 2;
		}
		else if ((car == 2)&&(door == 2))
		{
			goat = 3;
		}
		else if ((car == 3)&&(door == 3))
		{
			goat = 1;
		}
		else if ((car == 1)&&(door == 2))
		{
			goat = 3;
		}
		else if ((car == 1)&&(door == 3))
		{
			goat = 2;
		}
		else if ((car == 2)&&(door == 1))
		{
			goat = 3;
		}
		else if ((car == 2)&&(door == 3))
		{
			goat = 1;
		}
		else if ((car == 3)&&(door == 1))
		{
			goat = 2;
		}
		else if ((car == 3)&&(door == 2))
		{
			goat = 1;
		}
		if (car == door)
		{
			wins = wins + 1;
		}
		else
		{
			loss = loss + 1;
		}
		
		rounds = rounds - 1;
		}
		
		while ((option.equals("switch")) && (rounds > 0))
		{
			Random rand = new Random();
			int door = rand.nextInt(3) + 1;
			int car = rand.nextInt(3) + 1;
			int goat = 0;
			
			if ((car == 1)&&(door == 1))
			{
				goat = 2;
			}
			else if ((car == 2)&&(door == 2))
			{
				goat = 3;
			}
			else if ((car == 3)&&(door == 3))
			{
				goat = 1;
			}
			else if ((car == 1)&&(door == 2))
			{
				goat = 3;
			}
			else if ((car == 1)&&(door == 3))
			{
				goat = 2;
			}
			else if ((car == 2)&&(door == 1))
			{
				goat = 3;
			}
			else if ((car == 2)&&(door == 3))
			{
				goat = 1;
			}
			else if ((car == 3)&&(door == 1))
			{
				goat = 2;
			}
			else if ((car == 3)&&(door == 2))
			{
				goat = 1;
			}
			
			if ((goat == 1)&&(door == 2))
			{
				door = 3;
			}
			else if ((goat == 1)&&(door == 3))
			{
				door = 2;
			}
			else if ((goat == 2)&&(door == 1))
			{
				door = 3;
			}
			else if ((goat == 2)&&(door == 3))
			{
				door = 1;
			}
			else if ((goat == 3)&&(door == 1))
			{
				door = 2;
			}
			else if ((goat == 3)&&(door == 2));
			{
				door = 1;
			}
			
			if (car == door)
			{
				wins = wins + 1;
			}
			else
			{
				loss = loss + 1;
			}
			
			rounds = rounds - 1;
		}
		float dwins = wins;
		float drounds = rounds2;
		float percent = dwins * (100.0f) / drounds;
		
		System.out.println("The player won " + wins +"/" + rounds2 +" games (" + percent + "%)!");
		
	}
}