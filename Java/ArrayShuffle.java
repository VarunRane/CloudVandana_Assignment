import java.util.Random;

public class ArrayShuffle
{
   	public static void main(String[] args) 
	{
        	Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        
        	Shuffle(array);
        
        	// Print the shuffled array
        	for (int element : array) 
		{
           		System.out.print(element + " ");
        	}
    	}
    
    	public static void Shuffle(Integer[] array) 
	{
        	int n = array.length;
        	Random random = new Random();
        
        	for (int i = n - 1; i > 0; i--) 
		{
            		int j = random.nextInt(i + 1);
            
            		// Swap array[i] and array[j]
            		Integer temp = array[i];
            		array[i] = array[j];
            		array[j] = temp;
        	}
    	}
}