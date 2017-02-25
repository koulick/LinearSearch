
public class LinearSearch {
	public static void main(String args[])
	{
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 6;
		numbers[2] = 2;
		numbers[3] = 7;
		numbers[4] = 9;
		
		System.out.println("Index is: " + linearSearch(numbers, 2));
	}
	
	static int linearSearch(int[] numbers, int value)
	{
		for (int i = 0; i < numbers.length; i ++)
		{
			if (value == numbers[i])
			{
				return i; 
			}
		}
		return -1;
	}
}
