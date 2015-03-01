
public class Ex2 {
	public static void main(String [] args){
		
		int[] s={23, 14, 45, 34, 56, 12};
		int max, min;
		float mean=0;
		int sum=0;
		max=min=s[0];
		for (int i=0; i<s.length;i++)
		{
			if(max <= s[i])
				max=s[i];
			if(min >= s[i])
				min=s[i];
			sum +=s[i];
			
		}
		mean = sum/s.length;
		System.out.printf("The max number is "+max+", the min number is "+min+", the mean number is "+mean);
	}
}
