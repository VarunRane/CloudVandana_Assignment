import java.util.*;

public class RomanToInteger 
{
    	public static void main(String[] args)
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a Roman numeral: ");
        	String romanNumeral = scanner.nextLine();
        	int result = Roman(romanNumeral);
        	if (result == -1) 
		{
            		System.out.println("Invalid Roman numeral.");
        	} 
		else 
		{
            		System.out.println("The integer equivalent is: " + result);
        	}
        	scanner.close();
    	}

    	public static int Roman(String s)
	{
        	Map<Character, Integer> RomanMap = new HashMap<>();
        	RomanMap.put('I', 1);
        	RomanMap.put('V', 5);
        	RomanMap.put('X', 10);
        	RomanMap.put('L', 50);
        	RomanMap.put('C', 100);
        	RomanMap.put('D', 500);
        	RomanMap.put('M', 1000);

	        int result = 0;
        	int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) 
		{
            		int value = RomanMap.getOrDefault(s.charAt(i), -1);

            		if (value == -1) 
			{
                		return -1; // Invalid Roman numeral
            		}

	            	if (value < prevValue) 
			{
                		result -= value;
            		} 
			else 
			{
                		result += value;
            		}

            		prevValue = value;
        	}

        	return result;
    	}
}