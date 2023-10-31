import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker 
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a sentence: ");
        	String input = scanner.nextLine();
        	scanner.close();

        	boolean isPangram = isPangram(input);

        	if (isPangram) 
		{
            		System.out.println("The input is a pangram.");
        	}
		else
		{
            		System.out.println("The input is not a pangram.");
        	}
    	}

    	public static boolean isPangram(String s) 
	{
        	s = s.replaceAll("\\s", "").toLowerCase();

        	HashSet<Character> letterSet = new HashSet<>();

        	for (char c : s.toCharArray()) 
		{
            		if (Character.isLetter(c)) 
			{
                		letterSet.add(c);
            		}
        	}

        	return letterSet.size() == 26;
    	}
}
