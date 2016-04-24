/*

insofe prob 2: on code chef

Problem Name :

Check whether given sequence of robot moves is circular or not. 

Problem description :

Write the 'isCircular' function that takes a a sequence of moves for a robot as a string, check if the sequence is circular or not.

A sequence of moves is circular if first and last positions of robot are same. A move can be on of the following.

G - Go one unit 

L - Turn left 

R - Turn right 

Function prototype :

'int isCircular(string S)' 

Example:

Input: GLGLGLG 

Output: CIRCULAR 

Input: GLL 

Output: NOT CIRCULAR 

Hint: The idea is to consider the starting position as (0, 0) and direction as East (We can pick any values for these). If after the given sequence of moves, we come back to (0, 0), then given sequence is circular, otherwise not. 

 

The move ‘G’ changes either x or y according to following rules.

a) If current direction is North, then ‘G’ increments y and doesn’t change x. 

b) If current direction is East, then ‘G’ increments x and doesn’t change y. 

c) If current direction is South, then ‘G’ decrements y and doesn’t change x. 

d) If current direction is West, then ‘G’ decrements x and doesn’t change y. 

The moves ‘L’ and ‘R’, do not change x and y coordinates, they only change direction according to following rule. 

a) If current direction is North, then ‘L’ changes direction to West and ‘R’ changes to East 

b) If current direction is East, then ‘L’ changes direction to North and ‘R’ changes to South 

c) If current direction is South, then ‘L’ changes direction to East and ‘R’ changes to West 

d) If current direction is West, then ‘L’ changes direction to South and ‘R’ changes to North. 

Sample main function in C++: 


int main()

{

string path;

cin >> path;

if (isCircular(path))

{ 

cout << "CIRCULAR";

}

else

{

cout << "NOT CIRCULAR";

}

getchar();

return 0;

}
*/
package ocr;

import java.util.Scanner;

public class Robot1 {
	public int isCircular(String s)
	{
		char direction='e';
		int i=0;
		int result=0;
		int point_x=0;
		int point_y=0;
		char[] seq=s.toCharArray();
		for(i=0;i<seq.length;i++)
		{
			if(seq[i]=='G')
			{
				if(direction=='n')
				{
					point_y++;
				}
				if(direction=='e')
				{
					point_x++;
				}
				if(direction=='w')
				{
					point_x--;
				}
				if(direction=='s')
				{
					point_y--;
				}
				 
			}
			if(seq[i]=='L')
			{
				switch(direction)
				{
				case 'n':direction='w';
						break;
				case 'w':direction='s';
				break;
				case 's':direction='e';
				break;
				case 'e':direction='n';
				break;
				default: direction='n';
				break;
				}
			}
			if(seq[i]=='R')
			{
				switch(direction)
				{
				case 'n':direction='e';
						break;
				case 'w':direction='n';
				break;
				case 's':direction='w';
				break;
				case 'e':direction='s';
				break;
				default: direction='s';
				break;
				}
			}
			
		}
		if(point_x==0&&point_y==0)
		{
			result=1;
		}
		return result;
	}
	
public static void main(String args[])
{
	Robot1 r=new Robot1();
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	//String input=args[0].toString();
	//System.out.println(r.isCircular(input));
	if(r.isCircular(input)==1)
	{
		System.out.println("CIRCULAR");
	}
	else
	System.out.println("NOT CIRCULAR");
	
	sc.close();
}
}
