
import java.util.Scanner;

public class Limit
{

	public static void main(String[] args)
	{

			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a number: "); // READS INT N
			
			int N = input.nextInt(); // user's number // change INPUT TO VARIABLE N
			
			double result = Math.pow((1+1.0/N), N); // use the formula // COMPUTE THE FORMULA
			
			System.out.println("Result -> " + result); // WE PRINT THE RESULT
			
			/* After N is 100 or more the result is always close to 2.7
			Please enter a number: 10
			Result -> 2.5937424601000023
			Please enter a number: 100
			Result -> 2.7048138294215285
			Please enter a number: 1000
			Result -> 2.7169239322355936
			Please enter a number: 10000
			Result -> 2.7181459268249255
			Please enter a number: 100000
			Result -> 2.7182682371922975
			Please enter a number: 1000000
			Result -> 2.7182804690957534
			*/
		
	}
}
