class fibanocci
{
	public static void main(String[] args)
	{
		int limit = 20;
		int n1 = 0;
		int n2 = 1;
		int n3;
		while(n1 <= limit)
		{
			System.out.print(n1 +" ");
			n3 = n1+n2;
			n2 = n1;
			n1 = n3;
		}
	}
}
