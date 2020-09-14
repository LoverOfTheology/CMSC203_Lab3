package Movie;
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String repeat = "y";
		String again;
		do {
		System.out.println("Enter the name of the movie ");
		String title = keyboard.nextLine();
		System.out.println("Enter the rating of the movie ");
		String rating = keyboard.nextLine();
		System.out.println("Enter the number of tickets sold for this movie ");
		int numOfTik = keyboard.nextInt();
		System.out.println(title+" (" + rating + "): Tickets Sold: " + numOfTik);
		keyboard.nextLine();
		System.out.println("Do you want to enter another movie? (y or n)");
		again = keyboard.nextLine();
		}while(repeat.equals(again));
		System.out.println("Goodbye");
	}

}
