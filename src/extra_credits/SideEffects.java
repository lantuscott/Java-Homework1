package extra_credits;

public class SideEffects {

	public static void main(String[] args) 
	{
		double number = 4*Math.random();

		if (number > 2)
			System.out.println("The value is more than 2 -> " + number);
		else
			System.out.println("The value is less than 2 -> " + number);
		
	}

}
