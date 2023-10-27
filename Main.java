import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //Scanner input allows user to enter in the sentence
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a sentence");
	String sentence = input.nextLine();
	String lowerSentence = sentence.toLowerCase();
	    //Global variables 
	//To show the amount of vowels in the sentence
	int totalVowelCount = 0;
	String vowels = "aeiou";
	//Keeping count of vowels while iterating through sentence
	int currVowelCount = 0;
	
	System.out.println("In the sentence '" + sentence + "' : There are: ");
	//This will iterate through the string vowels to find the count of each vowel
	for (int i = 0; i < vowels.length(); i++)
	{
	    currVowelCount = 0;
	    int c = 0;
	//While loop to keep moving the starting position to find the next vowel, and to keep count of the vowels
	    while (lowerSentence.indexOf(vowels.charAt(i), c) != -1)
	    {
	        c = lowerSentence.indexOf(vowels.charAt(i), c) + 1;
	        currVowelCount = currVowelCount + 1;
	    }
	//Set totalVowelCount to the current vowel count
	    totalVowelCount = totalVowelCount + currVowelCount;
	    System.out.print(currVowelCount + " " + vowels.charAt(i) + "\'s, ");
	    
	}
	
	System.out.println();
	System.out.println("Total number of vowels are " + totalVowelCount);
	
   //Keeping count of special characters while iterating through sentence	
	int countOfNonChar = 0;
   
   // This loop will iterate through the sentence and find and keep count of the non-letter characters
	for (int i = 0; i < sentence.length(); i++)
	{
	    char c = sentence.charAt(i);
	    if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
	       countOfNonChar = countOfNonChar + 1;
	    
	}
	System.out.println("The amount of non-letter characters is: " + countOfNonChar);
	}
}

