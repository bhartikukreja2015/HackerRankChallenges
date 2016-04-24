//get result of n numbers
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTwoNumbers 
{
public static void main(String args[]) throws Exception 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String firstline = br.readLine();
    
    int N = Integer.parseInt(firstline);
    
    for(int i=0; i<N;i++)
    {
    	String secondline = br.readLine();	
    	StringTokenizer st=new StringTokenizer(secondline," ");
    	int result=0;
    	while(st.hasMoreTokens())
    	{
    		result+=Integer.parseInt(st.nextToken());
    	}
    	System.out.println(result);
    }
  
}
}
