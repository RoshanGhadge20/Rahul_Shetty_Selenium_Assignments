package Rahul_Shetty_Practice_Projects.Assignment;

public class Assignment10 {
	public static void main(String[] args) {
		
		// find out minimum of number from arrays
		
		int a[][]= {{1,2,4},{2,3,5},{5,6,8}};
		int min=a[0][0];
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				/*
				 * System.out.print(a[i][j]); System.out.print("\t");
				 */
				if(min>a[i][j])
				{
					min=a[i][j];
				}
			}
//			System.out.println("");
		}
		System.out.println("Minimum of number from array is"+min);
	}

}
