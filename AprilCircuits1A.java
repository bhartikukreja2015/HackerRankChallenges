import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AprilCircuits1A 
{
	static int i,c;
	static boolean isVowel(char ch)
	{
		 if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='y'))
			 return true;
		 else
			 return false;
	}
	static int vowelcount(String s)
    {
	
        for( i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            c++;
        }
        return c ;
    }


	public static void main(String args[] ) throws Exception 
	{
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       
	        String firstline = br.readLine();
	       
	        int N = Integer.parseInt(firstline);
	        for(int i=0; i<N;i++) 
	        	   { 

			        String secondline = br.readLine();	 
			       int check=0;
			        int vowelCount=vowelcount(secondline);
			       if(vowelCount<(secondline.length()-vowelCount))
			        {
			    	   System.out.println("hard"); 
			    	   continue;
			        }
			       char secondLineChar []=secondline.toCharArray();
			      for(int j=0; j<secondLineChar.length;j++)
			       {
			    	  if(check>=3)
			    	  {
			    		  System.out.println("hard");
			    		  break;
			    	  }
			    	   if(!isVowel(secondLineChar[j]))
			    	   {
			    		   check++;
			    	   }
			    	   else
			    	   {
			    		   check=0;
			    	   }
			       }
			           
			      if(check<3)
			      {
			    	  System.out.println("easy");
			      }
			    	  
			       
			           
	        	   }

	}
}
