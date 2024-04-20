package Rahul_Shetty_Practice_Projects.Assignment;

import java.util.ArrayList;

public class Assignment12 {
	public static void main(String[] args) {
		int a[] = { 4, 5, 5, 5, 4, 6, 9, 4 };

		ArrayList<Integer> uniqueNumbers = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if (uniqueNumbers.contains(a[i])) {
				uniqueNumbers.remove((Integer) a[i]); // Remove from unique list if it repeats
			} else {
				uniqueNumbers.add(a[i]);
			}
		}
		System.out.println(uniqueNumbers);
		if (uniqueNumbers.size() == 1) {
			System.out.println("Unique number is: " + uniqueNumbers.get(0));
		} else {
			System.out.println("No unique number found.");
		}
	}
}
