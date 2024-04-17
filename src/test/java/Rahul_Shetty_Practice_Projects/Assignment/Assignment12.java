package Rahul_Shetty_Practice_Projects.Assignment;

import java.util.ArrayList;

public class Assignment12 {
    public static void main(String[] args) {
        int a[] = {4, 5, 5, 5, 4, 6, 9, 4};
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (!al.contains(a[i])) {
                al.add(a[i]);
               
				count++;
            }
        }
        
        for (Integer num : al) {
        	/*if(count==1) {*/
            System.out.println(num + " is a unique number");
        }
    }
}
