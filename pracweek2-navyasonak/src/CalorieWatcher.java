import java.util.Scanner;
public class CalorieWatcher {

	public static void main(String[] args) {
		  Scanner keyboard = new Scanner(System.in);

		  final byte MAX_COOKIES = 40;          // the number of cookies in a bag
		    final byte SERVES_IN_BAG = 10;        // the number of serves of cookies in a bag
		    final short CALORIES_IN_SERVE = 300;  // the calories per serve of cookies

		    byte numCookies;                      // number of cookies eaten
		    float servesConsumed;                 // number of serves consumed
		    float totalCalories;                  // total calories consumed

		  
		    // Get the number of cookies eaten
		    System.out.print("How many cookies did you eat? ");
		    numCookies = keyboard.nextByte();

		    // Calculate number of serves consumed
		    servesConsumed = (float)numCookies/MAX_COOKIES * SERVES_IN_BAG;

		    // Calculate calories consumed
		    totalCalories = servesConsumed * CALORIES_IN_SERVE;

		    // Display consumed calories information
		    System.out.print("You consumed " + totalCalories);
		    System.out.print(" calories when you ate " + numCookies);
		    System.out.println(" cookies.");

		    keyboard.close();
	}

}
