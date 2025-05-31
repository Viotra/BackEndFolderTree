package week04;
//Test
import java.util.Arrays;

public class Week04Assignment {
	public static void main(String args[]) {
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//		I am going to use .length to find the number of values in the array, then I will -1 because the array is 0 based.
		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		System.out.println(lastMinusFirst);
//	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
	//Since array is an object and I don't have values to directly add to it, I have to declare new and specify how many values will be added to the array.
		int[] ages2 = new int[9];
	
//	i. Make sure that there are 9 elements of type int in this new array.  
        for (int i = 0; i < ages2.length; i++) {
        	ages2[i] = (int) (Math.random() * 100); //This is just so that I don't have come up with my own numbers.
        	//System.out.println(ages2[i]);
        	
        }
        System.out.println(Arrays.toString(ages2));
        //System.out.println(Arrays.toString(ages));
//	ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
        int lastMinusFirst2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(lastMinusFirst2);
//	iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
        //I do not understand the premise of iii. as the index values are not dynamic for an array. We can have an index out of bound error if we try to use an index that is not in the array.
        //My best guess is that this prompt is asking to show code that can index through an array regardless of the size
        //The for loop here will start at index 0 and increment by 1 after printing the element found at index i. It does not go out of bounds as it has to be less than the length or number of elements in the array.
        for (int i = 0; i < ages.length; i++) { //This will print out 7 elements as ages has 7 elements
        	System.out.println(ages[i]);
        }
        
        for (int i = 0; i < ages2.length; i++) { //This will print out 9 elements as ages2 has 9 elements
        	System.out.println(ages2[i]);
        }
//	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        //Not stated which array. I will do both. I created a method at the bottom called averageAge which utilizes and enhanced for loop.
        System.out.println(averageAge(ages));
        System.out.println(averageAge(ages2));
//	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        //Once again, I created a method at the bottom for this which will use an enhanced for to add the length of each String to an int and divide that int by the lenght of the String array.
        System.out.println(averageLetters(names));
//	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        //created concatArray to do this using a StringBuilder so that I am not using a space in memory for every concatenation in the loop.
        System.out.println(concatArray(names));
//	3. How do you access the last element of any array?
        //Access of the last element can be done simply by using the last index of the array if it is known, or by subtracting 1 from the length attribute of the array to get the index.
        System.out.println(names[names.length - 1]);
        System.out.println(names[5]);
//	4. How do you access the first element of any array?
        System.out.println(names[0]);
//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths;
        nameLengths = new int[names.length];
        
        //I wanted to use the enhanced for, but I figured the traditional for would be easier
        for (int i = 0; i < names.length; i++) {
        	nameLengths[i] = names[i].length(); // i will go from 0 to 5 since the names array has 6 elements. i will be used to represent the index for both the names array and the nameLengths array
        }
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        //I am going to write a method using a while loop just to show the use of a while. I will call the method sumLengths
        System.out.println(sumLengths(nameLengths));
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        System.out.println(concatWordTimesX("Wonderful", 12));
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
        System.out.println(getFullName("Batt", "Masterson"));
//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int[] numbers = {1, 2, 3, 4, 5};
        //Initially, I tried to put the values in the method directly as {101, 104, 256, 390}, but that didn't work.
        System.out.println(sumOver100(numbers));
//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
        double[] doubles = {3.14, 16.5, 187.77, 525600.6};
        System.out.println(averageDoubles(doubles));
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] doubles2 = {9001, 1000};
        System.out.println(isArrayGreater(doubles, doubles2));
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        boolean isHotOutside = !true;
        double moneyInPocket = 3.6;
        System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        //This method was made because I love playing games that give letters and allow the players to compete to create longer words.
        //I also like that this is just getting letters as methods should be fairly simple in nature
        System.out.println(anagramLetters(10));
	}
	
	public static char[] anagramLetters(int num) {
		char[] letters = new char[num]; //this store our letters where num represents how many letters we will get to make a word
		
		for (int i = 0; i < num; i++) {
			//Here, I am filling my array with a letter at index i. I am getting my letter by finding a random number equal to what the ASCII value would be. E.g. 0-25 + 65
			letters[i] = (char)((int)(Math.random() * 26 + 65)); 
		}
		
		return letters;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean buyDrink;
		//using an if with an else just to show that I can use an else
		if (isHotOutside && moneyInPocket > 10.50) {
			buyDrink = true;
		}
		else {
			buyDrink = false;
		}
		
		return buyDrink;
	}
	
	public static boolean isArrayGreater (double[] greater, double[] lesser) { //I named my parameters greater and lesser so that the user should know which array is which
		boolean isGreater = false;
		double greaterAvg = averageDoubles(greater); //nothing said I couldn't use my other methods
		double lesserAvg = averageDoubles(lesser);
		
		if(greaterAvg > lesserAvg) {
			isGreater = true; //I do not need an else since isGreater was already set to false.
		}
		
		return isGreater;
	}
	
	public static double averageDoubles(double[] nums) {
		double average = 0;
		
		for (double num : nums) {
			average += num;
		}
		
		return average /= nums.length; //This is just a repeat of the age average honestly
	}
	
	public static boolean sumOver100(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum > 100;
	}
	
	public static String getFullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName; //I did not use a String Builder as this could be done with one String.
		return fullName;
	}
	
	public static String concatWordTimesX(String word, int n) {
		StringBuilder concat = new StringBuilder();
		
		//I didn't need to use a do while, but I figured I should use it at least once. This guarantees the word will append at least once.
		do {
			concat.append(word);
			n--; //n was provided by the prompt, so I am using it in place of i. I am decrementing in this loop because it was easier than creating another variable.
		}while(n > 0);
		
		return concat.toString();
	}
	
	public static int sumLengths(int[] lengths) {
		int sum = 0;
		int i = 0;
		
		while(i < lengths.length) {
			sum += lengths[i];
			i++;
		}
		
		return sum;
	}
	
	public static int averageAge (int[] ages) {
		int avgAge = 0;
		
		for(int age : ages) {
			avgAge += age;
		}
		
		avgAge /= ages.length;
		return avgAge;
	}
	
	public static int averageLetters (String[] strs) {
		int avgLetters = 0;
		for (String str : strs) {
			avgLetters += str.length();
		}
		avgLetters /= strs.length;
		
		return avgLetters;
	}
	
	public static String concatArray(String[] strs) {
		StringBuilder concat = new StringBuilder();
		//Using traditional for loop so that I can ignore the space on the last element
		for (int i = 0; i < strs.length; i++) {
			//Use of a condition allows me to avoid adding a space to the last element
			if(i == strs.length - 1) {
				concat.append(strs[i]);
			}
			else {
				concat.append(strs[i] + " ");
			}
		}
		return concat.toString();
	}
}