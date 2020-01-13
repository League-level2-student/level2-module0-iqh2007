package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = new String[5];

		// 2. print the third element in the array
		System.out.println(strings[2]);

		// 3. set the third element to a different value
		strings[2] = "numbers";

		// 4. print the third element again
		System.out.println(strings[2]);

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(strings[i]);
		}

		// 6. make an array of 50 integers
		int[] integers = new int[50];

		// 7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for (int i = 0; i < 50; i++) {

			integers[i] = random.nextInt(50);

		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
	
		int smallestNumber1 = 50;
		for(int i = 0; i < integers.length; i++ ) {
			if(smallestNumber1 > integers[i]) {
				smallestNumber1 = integers[i];
			}
		}

		// 9 print the entire array to see if step 8 was correct
		System.out.println(smallestNumber1);
		
		// 10. print the largest number in the array.
		
		int greatestNumber = 0;
		for(int i = 0; i > integers.length; i++ ) {
			if(greatestNumber < integers[i]) {
				greatestNumber = integers[i];
			}
		}
		
		System.out.println(greatestNumber);
		
		
		
		
		
		
		
		
		
		
		
	}
}
