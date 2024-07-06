package CodingAssignmentWeek04;

import java.util.Arrays;

public class Assignment {

	public static void main(String[] args) {
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
//2. Programmatically subtract the value of the first element in the array from the value in the last element of the array.
		int a = ages[0];
	    int b = ages[ages.length -1];
	        int summ = b - a;
	            System.out.println(summ);
	    	
		
//3.Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
//i. Make sure that there are 9 elements of type int in this new array.  
//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

		int[] ages2 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};	
		int x = ages2[0];
		int y = ages2[ages2.length -1];
		int sum = y - x;
		System.out.println(sum);
			
//4. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters / names.length);
		
		
//5. How do you access the first element of any array?
	 System.out.println("First element of array" + (ages[0]));

		
//6.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	 int[] nameLengths = new int[names.length];
	 for (int i = 0; i < names.length; i ++) {
			nameLengths [i] = names [i].length();
		}	
System.out.println(Arrays.toString(nameLengths));     

//7.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
System.out.println("*** Question 7***");
sumOfLetters = 0;
for (int name : nameLengths) {
	sumOfLetters += name;
}
System.out.println(sumOfLetters);
{


//8. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
String word = "Hello";
System.out.println(word.repeat(3));
	    	    
//9. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

String firstName, lastName;
firstName = "Sara";
lastName = "Abe";
System.out.println(firstName + " " + lastName);
		}
		
		
//Calling methods inside the main method so that Solution 10 and onwards can print.
		int [] length = {100,2,3,4,5};
		boolean name = sumOfArray(length);
		System.out.println(name);
		
		double [] length2 = {100,2,3,4,5};
		System.out.println(averageOfArray(length2));
			
		double [] list1 = {2.5, 2.5, 7.9};
		double [] list2 = {4.5, 2.6, 7.9, 8.8, 10.10, 11};
		System.out.println(averageOfElements(list1, list2));
		
		double moneyInPocket = 10.60;
		boolean isHotOutside = true;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		double item1 = 2.10;
		double moneyInWallet = 50.50; 
		System.out.println(canIbuyIt(item1, moneyInWallet));
	} //end of main

//10. Write a method that takes an array of int and returns true if the sum of all the int in the array is greater than 100.
public static boolean sumOfArray(int [] list)
		{
	int sum = 0;
	for (int i = 0; i < list.length; i++)
	{
		sum += list[i];
	}
	if (sum > 100)
	{return true;}
	else
	{return false;}
	
		}

		
//11. Write a method that takes an array of double and returns the average of all the elements in the array.
public static double averageOfArray(double [] list)
{
int sum = 0;
for (int i = 0; i < list.length; i++)
{
sum += list[i];
}
sum /= list.length;
return sum;

}


//12. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

public static boolean averageOfElements(double [] list1, double [] list2)
{
double sum1 = 0;
	for (int i = 0; i < list1.length; i++)
	{
	sum1 += list1[i];
	}
	sum1 /= list1.length;

	double sum2 = 0;
	for (int i = 0; i < list2.length; i++)
	{
	sum2 += list2[i];
	}
	sum2 /= list2.length;
	if (sum1 > sum2)
		return true;
	return false;
	}
		

//13. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
{

		if (moneyInPocket > 10.50 && isHotOutside)
		return true;
		
return false;
}

	
//14. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.	
// The method I created compares the money I have and the item price to decide if I can/should buy the item.
public static String canIbuyIt (double item1, double moneyInWallet)
{
	if (moneyInWallet >= item1)
	{
		return "You can buy it.";
	}
else 
{
	return "Sorry you can't.";
}
}
}






		

  
       		



