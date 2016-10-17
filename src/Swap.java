import java.util.Scanner;

public class Swap
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 1st number: ");
		
		int intA = input.nextInt();
		
		System.out.println("Please enter 2nd number: ");
		
		int intB = input.nextInt();
		
		// PROCESS OF SWAPPING
		
		int temp = intA;
		
		//WE SWAP!!!
		
		intA = intB;
		
		// WE RETURN THE VALUE OF TEMP
		
		intB = temp;
		
		System.out.println("Value of intA -> " + intA + " Value of intB -> " + intB);
		
		input.close();
		
	}

}
