
public class gcd {

	public static int GCD (int n, int m)
	{
		if (m == n)
			return m;
		else if (m > n)
			return GCD(m-n, n);
		else
			return GCD(m, n-m);
	}
	
	public static void main (String args[])
	{
		System.out.println(GCD(30, 20));
	}
}
