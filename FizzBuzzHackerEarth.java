//code to print fizz for multiples of 3 and buzz for multiples of 5 and fizzbuzz for multiples of 3 and 5, else write numer itself
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FizzBuzzHackerEarth 
{
	public static void main(String args[] ) throws Exception 
	{
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       
	        String firstline = br.readLine();
	        String secondline = br.readLine();
	        StringTokenizer st=new StringTokenizer(secondline," ");
	        int N = Integer.parseInt(firstline);
	        int arrayOfRAnge[]=new int[N];
	        int i=0;
	        while(st.hasMoreTokens())
	        {
	        	arrayOfRAnge[i]=Integer.parseInt(st.nextToken());
	        	i++;
	        }
	             for(int j=0; j<N;j++)
	             {
	            	 
	             	int size=arrayOfRAnge[j];
	             	//System.out.println("size of "+j+"th array is"+size);
	             	int[] array=new int [size];
	             	//System.out.println("printing jth array");
	             	 for(int num=0;num<size;num++)
	     	        {
	     	        array[num]=num+1;
	     	       // System.out.println(array[num]);
	     	        }
	             
	             			
	             			//System.out.println("ëntering for of size"+size);
	             			for(int c=0;c<size;c++)
	            	        {
	             				//System.out.println("converted array element"+array[c]);
	            	        	if(array[c]%3!=0&&array[c]%5!=0)
	            	        	{
	            	        		System.out.println(array[c]);
	            	        		continue;
	            	        	}
	            	        	if(array[c]%3==0)
	            	        	{
	            	        		System.out.print("Fizz");
	            	        	}
	            	        	if(array[c]%5==0)
	            	        	{
	            	        		System.out.print("Buzz");
	            	        	}
	            	        	System.out.println("");
	            	        	
	            	        }
	             			
	            	 
	             }
	        
	}
}
