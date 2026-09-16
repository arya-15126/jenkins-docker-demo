public class Main
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int high = a;
		if(b>high)
		{
			high = b;
		}
		if(c>high)
		{
			high = c;
		}
		System.out.println(high);
	}
}
		