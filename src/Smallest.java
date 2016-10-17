
public class Smallest
{

	public static void main(String[] args)
	{
		
		double d = 0.0000000000000001;
	
		double d2 = 10*d;
		
		System.out.println(1.0+d);
		
		System.out.println(1.0+d2);
		
		
		/* Can you explain why this happens for the particular number 
		 * of 0's you find? (This is related to how Java stores double values
		 * 
		 * I think that when double variables are larger than 15 decimals java rounds it up
		 *  to just one decimal 
		 * 
		 */
		
		
	}

}
