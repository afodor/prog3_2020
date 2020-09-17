package examples;


public class TimeExamples
{
	public static void main(String[] args)
	{
		byte b= 0;
		
		for( int x=0; x <1000; x++)
		{
			b = (byte) (b+1);
			
			System.out.println(b);
		}
	}
}	

