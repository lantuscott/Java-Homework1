
import java.util.Scanner;

public class Chill
{

	public static void main(String[] args)
	{
		/*Requirements:

			The user needs to input a number between the range of -58 and 41 Fahrenheit
			The user needs to input the wind speed greater or equal to 2.
			The program needs to display the windchill temperature.
			We need to use the formula (whatever it is)
			We need the math.pow()*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58F & 41F: "); // WE ASK FOR THE TEMP
		
		double ta = input.nextDouble(); // WE ACTUALLY READ THE TEMP
		
		System.out.println("Enter the wind speed (+ or equal 2) expressed in MPH: ");
			
		double v = input.nextDouble();
			
		double twc = (35.75 + 0.6215*ta - 35.75*Math.pow(v, 0.16) + 0.4275*ta*Math.pow(v, 0.16));
		
		System.out.println("The windchill index is -> " + twc);


	}

}
