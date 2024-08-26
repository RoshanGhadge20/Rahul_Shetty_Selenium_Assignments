package Rahul_Shetty_Practice_Projects.Assignment;

public class Assignment11 
{
    public static void main(String[] args)
    {

        // find out the max column value into the minimum of row
        int a[][] = {{1, 2, 4}, {2, 3, 5}, {5, 6, 8}};
        int columnvalue = 0; // Initialize columnvalue
        int min = a[0][0];
        System.out.println("Array:- ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                
                  System.out.print(a[i][j]); 
                  System.out.print("\t");
                  
                 
                if (min > a[i][j])
                {
                    min = a[i][j];
                    columnvalue = j; // Store the column index with the minimum value
                }
                
            }
            System.out.println("");
        }
        System.out.println("Minimum of value in array is "+min);

        int k = 0;
        int max = a[k][columnvalue]; // Use columnvalue instead of min
        while (k < 3)
        {
            if (a[k][columnvalue] > max) 
            { // Use columnvalue instead of min
                max = a[k][columnvalue]; // Use columnvalue instead of min
            }
            k++;
        }
        
        System.out.println("Maximum value from the column corresponding to the minimum value in row is " + max);
    }
}
