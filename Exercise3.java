package array2;

// try collections.sort(object)

public class Exercise3 {

	public static void main(String[] args) {
		// Sort an array of Strings by length
		String[] stArray = {"George", "Samantha", "Bob", "John" };
		for(int i = 0; i < stArray.length; i++)
		{
			System.out.print(stArray[i] + " ");
		}
		
		System.out.println("\nSorting...");
		
		boolean notSorted = true;
		String tempHolder = null;
		while(notSorted)
		{
			// Starts off [ is sorted ]
			notSorted = false;
			
			for(int i = 1; i < stArray.length; i++)
			{
				// < will sort so that largest is placed in front
				// > will sort so that smallest is placed in front
				if(stArray[i-1].length() < stArray[i].length())
				{
					// Triggers to be [ not sorted ]  if the above statment is true even once
					notSorted = true;
					// Save string at i - 1
					tempHolder = stArray[i-1];
					// Place string at i into i -1
					stArray[i-1] = stArray[i];
					// Place string from i -1 into i
					stArray[i] = tempHolder;
				}
			}
			// If the (stArray[i-1].length() ? stArray[i].length()) was true even once, 
			// loop again, work not done
		}
		
		for(int i = 0; i < stArray.length; i++)
		{
			System.out.print(stArray[i] + " ");
		}
	}

}
