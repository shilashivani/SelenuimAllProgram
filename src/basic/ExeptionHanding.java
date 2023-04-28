package basic;

public class ExeptionHanding {
	       public static void division(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		System.out.println("hello Welcome");
		try
		{
			ExeptionHanding.division(10, 0);
			
		}
		catch(Exception e)
		{
			System.out.println("please enter valied input");
		}
		finally
		{
			System.out.println("I am finally block");
		}
		
			
		
		System.out.println("thanx for using");
	}

}
