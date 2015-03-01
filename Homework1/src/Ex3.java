import java.io.*; 
import java.util.Scanner;

public class Ex3 {
	public static void main(String [] args) {
		int sumofeven = 0;
		int sumofall = 0;
		//The first method, based on math formula
	    sumofeven = (2+10000)*2500;
	    sumofall = (1+10000)*5000;
	    System.out.println("The sum of all even numbers is "+sumofeven+", the sum of all number is "+sumofall+".");
		//The second method.
	    int sum1=0;
	    int sum2=0;
	    for (int i=0; i<=10000; i++)
	    {
	    	sum1+=i;
	    	if (i%2==0)
	    	{
	    		sum2+=i;
	    	}
	    }
	    System.out.println("The sum of all even numbers is "+sum2+", the sum of all number is "+sum1+".");
	
	    int length = 0;
	    int width = 0;
	    
	    //First input method, with Scanner
	    System.out.println("Please input length and width.");
	    Scanner in1 = new Scanner(System.in);
	    length= in1.nextInt();
	    Scanner in2 = new Scanner(System.in);
	    width= in2.nextInt();
	    double diagonal = Math.sqrt(length*length+width*width);
	    int perimeter= length*2 + width*2;
	    System.out.println("The diagonal is "+diagonal+". The perimeter is "+perimeter+".");
	    
	  //Second input method, with Bufferedreader
	    String str = null;
	    System.out.println("Please input length and width.");
	    BufferedReader buf = new BufferedReader (new InputStreamReader(System.in)); 
	    try{
	    	      str=buf.readLine();
	         }catch(IOException e){
	    	e.printStackTrace();
	    	}
	    int length2 = Integer.parseInt(str);
	    BufferedReader buf2 = new BufferedReader (new InputStreamReader(System.in)); 
	 	    try{
	 	    	      str=buf2.readLine();
	 	         }catch(IOException e){
	 	    	e.printStackTrace();
	 	    	}
	    int width2 = Integer.parseInt(str);
	    diagonal = Math.sqrt(length2*length2+width2*width2);
	    perimeter= length2*2 + width2*2;
	    System.out.println("The diagonal is "+diagonal+". The perimeter is "+perimeter+".");
	}

}
