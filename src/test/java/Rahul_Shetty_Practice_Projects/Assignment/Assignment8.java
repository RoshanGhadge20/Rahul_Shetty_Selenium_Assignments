package Rahul_Shetty_Practice_Projects.Assignment;

public class Assignment8 
{
	public static void main(String[] args)
	{
		//wants to printout the
//		1234
//		567
//		89
//		10
		int k=1;
		/*
		 * for (int i=0;i<4;i++) { 
		 * for(int j=0;j<4-i;j++) { System.out.print(k);
		 * System.out.print("\t"); k++; } System.out.println(""); }
		 */
			
		
		// wants to printout the pyramid 
//		1
//		23
//		456
//		78910
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
			
	}

}
