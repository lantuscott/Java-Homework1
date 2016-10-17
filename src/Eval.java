
public class Eval
{

	public static void main(String[] args)
	{
	// an example of HW 1 Problem 1
	//	evaluating 1 + 2 * 3 - 4
	
	// note that each of the following has exactly one operations, two operands
				
		int temp1 = 3 - 1; //parentheses
		int temp2 = 2 + 3; // parentheses
		int temp3 = temp1 * 10; // multiplication
		int temp4 = temp3 / 5; // multiplication
		int temp5 = temp4 * temp2; //
		int temp6 = temp5 % 3;
		int result = 2 + temp6;
		
	// are they the same? should be!
		
		System.out.println(2+(3-1)*10/5*(2+3)%3);
		System.out.println(result);
		
	}

}
