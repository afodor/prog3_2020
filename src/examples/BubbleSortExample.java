package examples;

import java.util.Random;

public class BubbleSortExample
{
	
	public static void bubbleSort(int[] a)
	{
		for( int x=0; x < a.length -1; x++)
			for( int y=x+1; y < a.length; y++)
				if( a[x] > a[y])
				{
					int temp = a[x];
					a[x] = a[y];
					a[y] = temp;
				}
	}
	
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int[] a = new int[10];
		
		for( int x=0; x < a.length; x++)
		{
			a[x] = r.nextInt(100);
		}
		
		
		for( int x=0; x < a.length; x++)
		{
			System.out.println(a[x]);
			
		}
		
		System.out.println("sort");
		bubbleSort(a);
		

		for( int x=0; x < a.length; x++)
		{
			System.out.println(a[x]);	
		}
	}
	
}
