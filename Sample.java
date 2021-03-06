/* amazon hiring challenge hacker rank
Akash and GCD 1 
Max. Marks 100 
Akash is interested in a new function F such that,
F(x) = GCD(1, x) + GCD(2, x) + ... + GCD(x, x)
where GCD is the Greatest Common Divisor.
Now, the problem is quite simple. Given an array A of size N, there are 2 types of queries:
1. C X Y : Compute the value of F( A[X] ) + F( A[X + 1] ) + F( A[X + 2] ) + .... + F( A[Y] ) (mod 10^9 + 7)
2. U X Y: Update the element of array A[X] = Y 
Input:
First line of input contain integer N, size of the array.
Next line contain N space separated integers the elements of A.
Next line contain integer Q, number of queries.
Next Q lines contain one of the two queries. 
Output:
For each of the first type of query, output the required sum (mod 10^9 + 7). 
Constraints:
1 <= N <= 106
1 <= Q <= 105
1 <= Ai <= 5*105 
For Update ,
1 <= X <= N
1 <= Y <= 5*105 
For Compute ,
1 <= X <= Y <= N 
________________________________________
Sample Input
(Plaintext Link) 
3
3 4 3
6
C 1 2
C 1 3
C 3 3
U 1 4
C 1 3
C 1 2
Sample Output
(Plaintext Link) 
13
18
5
21
16
Explanation 
A[1] = 3, A[2] = 4, A[3] = 3
F(3) = GCD(1, 3) + GCD(2, 3) + GCD(3, 3) = 1 + 1 + 3 = 5.
F(4) = GCD(1, 4) + GCD(2, 4) + GCD(3, 4) + GCD(4, 4) = 1 + 2 + 1 + 4 = 8. 
First query, the sum will be F(3) + F(4) = 5 + 8 = 13 (mod 10^9 + 7).
Second query, the sum will be F(3) + F(4) + F(3) = 5 + 8 + 5 = 18 (mod 10^9 + 7).
Third query, the sum will be F(3) = 5 (mod 10^9 + 7).
Fourth query will update A[1] = 4.
Fifth query, the sum will be F(4) + F(4) + F(3) = 8 + 8 + 5 = 21 (mod 10^9 + 7).
Sixth query, the sum will be F(4) + F(4) = 8 + 8 = 16 (mod 10^9 + 7). 
________________________________________
Time Limit: 1.0 sec(s) for each input file. 
Memory Limit: 256 MB 
Source Limit: 1024 KB 
Marking Scheme: Marks are awarded if any testcase passes. 
Allowed languages: C, CPP, CLOJURE, CSHARP, GO, HASKELL, JAVA, JAVASCRIPT, JAVASCRIPT_NODE, LISP, OBJECTIVEC, PASCAL, PERL, PHP, PYTHON, RUBY, R, RUST, SCALA 


*/

//...................

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Sample {
	public static int gcd(int a, int b)
	{
		System.out.println("gcd of "+a+","+b+"is :");
		while(b>0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
		return a;
	}
	public static int gcdFull(int x)
	{
		System.out.println("finding gcds... for x as" +x);
		int input[]=new int[x];
		System.out.println("full stream for gcds with x is");
		for(int k=0; k<x; k++)
		{
			input[k]=k+1;
			System.out.println(input[k]);
		}
		int result=0;
		for(int i=0; i<input.length;i++)
		{
			result+=gcd(x, input[i]);
			
		}
		System.out.println("returning result for x as"+result);
		return result;
	}
public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String firstline = br.readLine();
        String secondline = br.readLine();
        String thirdline = br.readLine();
        //first
        int N = Integer.parseInt(firstline);
        System.out.println("first line is "+firstline);
        System.out.println("2 line is "+secondline);
        System.out.println("3 line is "+thirdline);
		int[] array=new int [N];
       //second
       StringTokenizer st=new StringTokenizer(secondline," ");
       int i=0;
            while(st.hasMoreTokens())
            {
            	if(i>=N)
            	{
            		break;
            	}
            	array[i]=Integer.parseInt(st.nextToken());
            	System.out.println("converted array element"+array[i]);
            			i++;
            }
           
        //third
            int noOfCases = Integer.parseInt(thirdline);
            System.out.println("cases n eventes"+noOfCases);
            for(int j=0;j<noOfCases;j++)
            {
            	 System.out.println("case number"+j);
            	 System.out.println(".......................");
            	String fourthline = br.readLine();
            	StringTokenizer st2=new StringTokenizer(fourthline," ");
            	StringBuffer cs=new StringBuffer("C");
            	StringBuffer us=new StringBuffer("U");
            	int a, b;
            	if(st2.nextToken().contentEquals(cs))
            	{
            		System.out.println("case chosen is C");
            		a=Integer.parseInt(st2.nextToken());
            		b=Integer.parseInt(st2.nextToken());
            		int output=0;
            		for(int k=a; k<=b;k++)
            		{
            			output+=gcdFull(array[k-1]);
            		}
            		System.out.println("finall.......->>output is"+output);
            	}
            	else
            	{
            		System.out.println("case chosen is U");
            		a=Integer.parseInt(st2.nextToken());
            		b=Integer.parseInt(st2.nextToken());
            		array[a-1]=b;
            		System.out.println("not any of  that output, here we changed array["+a+"] to "+b);
            	}
            }

        System.out.println("Hello World!");
    }

}

