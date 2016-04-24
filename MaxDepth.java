/*Insofe prob 1
Problem Name :

Find maximum depth of nested parenthesis in a expression 

Problem description :

Write the 'findMaxDepth' function that takes a string as input. Check whether parenthesis are balanced or not. If parenthesis are unbalanced return -1, otherwise find maximum depth of balanced parenthesis and return maximum depth.

Example:

Input : “( ((X)) (((Y))) )” 

Output : 4 

Reason : In this example. All the parenthesis are balanced, 'X' is surrounded by 3 and ‘Y’ is surrounded by 4, so max depth is 4. 

Input : ""; 

Output : 0 

Input : "b) (c) ()"; 

Output : -1 

Function prototype :

'int findMaxDepth(char *X)' 

Sample main function in C / C++: 


int main()

{

string S;

cin >> S;

cout << findMaxDepth(S);

return 0;

}
*/


import java.util.Scanner;

public class MaxDepth {
	int findMaxDepth(String s)
	{
		int count=0;
		int maxCount=0;
		int balance =0;
		char[] seq=s.toCharArray();
		for(int i=0;i<seq.length;i++)
		{
			if(balance<0)
			{
				return -1;
			}
			if(seq[i]=='(')
			{
				count++;
				balance++;
			}
			if(seq[i]==')')
			{
				count--;
				balance--;
			}
			if(count>maxCount)
			{
				maxCount=count;
			}
		}
		if(balance!=0)
		{
			return -1;
		}
		
		return maxCount;
	}
	public static void main(String args[])
	{
	MaxDepth mRef=new MaxDepth();
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	System.out.println(mRef.findMaxDepth(input));
	/*System.out.println(mRef.findMaxDepth("b) (c) ()"));
	System.out.println(mRef.findMaxDepth("")); 
	System.out.println(mRef.findMaxDepth("(((X))(((y))))"));*/
	sc.close();
	}
}
