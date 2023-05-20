package Week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		
		//
		// Arrays:
		// 
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = {1, 5, 2, 8, -3, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(array[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(array[array.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(iSecRating[6]);
		// Error, out of bounds
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(iSecRating[-1]);
		//Error
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Each element: " + array[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int number : array) {
			System.out.println(number);
		}
			
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		double sum = 0;
		
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / array.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int number : array) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Rober"};
		
		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
	

		//
		// Methods:
		//

		greet("Tom");
		greet("Sally");
		String greeting = greet2("Morgan");
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(greeting);
		System.out.println(isStringLongerThanNumber("He", 3));
		System.out.println(doesArrayContainString(names, "Sam"));
		System.out.println(getSmallestNum(array));
		System.out.println(calculateAverage(doubles));
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
			System.out.println(hasMoreEvenWordCharacters(names));
			System.out.println(isPalindrome("racecar"));
		}
	}
	
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
	public static void greet(String name) {
		System.out.println("Good evening, " + name);
	}
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
	public static String greet2(String name) {
		return "Good evening, " + name;
	}
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}

		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		public static boolean doesArrayContainString(String[] array, String string) {
			for (String str : array) {
				if (str.equals(string)) {
			 return true; 
			} 
			}
			return false;
			
		}
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		public static int getSmallestNum(int[] numbers) {
			int smallest = numbers[0];
			for (int number : numbers) {
				if (number < smallest) {
					smallest = number;
				}
			}
			return smallest;
		}
			
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		public static double calculateAverage(double[] average) {
			double sum = 0;
			for (double number : average) {
				sum += number;
			}
			return sum / average.length;
		}

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		public static int[] extractStringLengths(String[] strings) {
			int[] results = new int[strings.length];
			for (int i = 0; i < strings.length; i++) {
				results[i] = strings[i].length();
			}
			return results; 
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		public static boolean hasMoreEvenWordCharacters(String[] array) {
			int evenLetters = 0;
			int oddLetters = 0;
			
			for (String string : array) {
				if (string.length() % 2 == 0) {
					evenLetters += string.length();
				} else { 
					oddLetters += string.length();
			}
		}
			return evenLetters > oddLetters;
		}
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		public static boolean isPalindrome(String string) {
			//racecar
			//mom
			//wow
			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					return false;
				}
			}
			return true;
		}
		
		
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:

	}
