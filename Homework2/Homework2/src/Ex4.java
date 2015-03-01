
public class Ex4 {
	public static void main(String [] args)
	{
		for(int i=999; i>=0; i--)
		{
			//First digit
			int a1=i/100;
			//Second digit
			int a2=i%100/10;
			//Third digit
			int a3=i%10;
			if (i>=100)
			{
				if(i==(Math.pow(a1, 3)+Math.pow(a2, 3)+Math.pow(a3, 3)))
				{
				System.out.println(i);
				}
			}
			if (i>=10)
			{
				if(i==(Math.pow(a1, 2)+Math.pow(a2, 2)+Math.pow(a3, 2)))
				{
				System.out.println(i);
				}
			}
			if (i>0)
			{
				if(i==(Math.pow(a1, 1)+Math.pow(a2, 1)+Math.pow(a3, 1)))
				{
				System.out.println(i);
				}
			}
		}
	}
}
