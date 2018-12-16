public class fact {

	public static int fact(int n) {
		int result; 
		if (n==0 || n==1) 
		{
			return 1;
		}
		else 
		{
			result = n * fact(n-1);
		}
		return result;
	}

public static void main (String args[])
{
	System.out.println(fact(5));
}
}

