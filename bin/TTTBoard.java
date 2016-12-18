
public class TTTBoard
{
	// Instance variable cells is declared for you...
	
	private char[ ][ ] cells;
	
	public TTTBoard()
	{
		cells = new char[3][3];
		
		for (int row = 0; row<3; row++)
			for (int col=0; col<3; col++)
				cells[row][col] = ' ' ;
		
	}
	
	public TTTBoard(String s)
	{
		this();
		int c=0;
		System.out.println("s lenght "+s.length());

		if(s.length() < 8 ) {
			for (int row = 0; row < 3; row++)
				for (int col = 0; col < 3; col++)
					cells[row][col] = ' ';
		} else if(s.length() ==9 ) {
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					cells[row][col] = s.charAt(c);

					int ch = s.charAt(c);

					if (ch == 'X' || ch == '0' || ch == ' ')
						cells[row][col] = (char) ch;
					c++;
				}
			}
		}
	}
	
	public String toString()
	{
		String result = "- - - - \n";
		result = result + "|"+cells[0][0]+"|"+cells[0][1]+"|"+cells[0][2] + "|\n";
		result = result + "- - - - \n";
		result = result + "|"+cells[1][0]+"|"+cells[1][1]+"|"+cells[1][2] + "|\n";
		result = result + "- - - - \n";
		result = result + "|"+cells[2][0]+"|"+cells[2][1]+"|"+cells[2][2] + "|\n";
		result = result + "- - - - \n";

		return result;
	}
	
/*	private char getWinner(['X'] || ['0'])
	{

		if(cells[0][0]==cells[0][1] &&
			cells[0][1]==cells[0][2])
		else
	}*/
	
	public static void main(String[] args)
	{
		
		TTTBoard board = new TTTBoard("abcdefgh");
		StdOut.println(board.toString());
//		StdOut.println(board.cells);
	}

}
