import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Position
{
	int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int y;
	Position()
	{
		
	}
	
}
public class BearWalk {
	static LinkedList<Position> travelledPos=new LinkedList<Position>();
	public static void markTravelledCell(int x, int y)
	{
		Position pos=new Position();
		pos.setX(x);
		pos.setY(y);
		travelledPos.add(pos);
	}
	public static boolean isPossible(char[] seq)
	{
		
		int i=0;
		boolean result=true;
		int point_x=0;
		int point_y=0;
		//mark origin
		markTravelledCell(point_x,point_y);
		//amrk positions
		for(i=0;i<seq.length;i++)
		{
			if(seq[i]=='R')
			{
				point_x++;			
				markTravelledCell(point_x,point_y);
			}
			if(seq[i]=='L')
			{
				point_x--;			
				markTravelledCell(point_x,point_y);
			}
			if(seq[i]=='U')
			{
				point_y++;			
				markTravelledCell(point_x,point_y);
			}
			if(seq[i]=='D')
			{
				point_y--;			
				markTravelledCell(point_x,point_y);
			}
			
		}
		//check conditions of impossible reach, without re visiting
		Position posChk=new Position();
		//case1 origin if fully surrounded or trapped
		int x=0;
		int y=0;
		int countchk=0;
		//for up
			posChk.setX(x);
			posChk.setY(y+1);
			if(travelledPos.contains(posChk))
			{
				countchk++;
			}
			//for down
			posChk.setX(x);
			posChk.setY(y+1);
			if(travelledPos.contains(posChk))
			{
				countchk++;
			}
		
		//case 2 current position is surrounded or trapped
		if(point_x==0&&point_y==0)
		{
			result=false;
		}
		return result;
	}
	
public static void main(String args[]) throws Exception
{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String firstline = br.readLine();
    int N = Integer.parseInt(firstline);
    for(int i=0; i<N;i++) 
	   { 
    	 	String secondline = br.readLine();
    	 	char [] moves=secondline.trim().toCharArray();
    	 	if(!isPossible(moves))
    	 	{
    	 		System.out.println("impossible");
    	 		continue;
    	 	}
    	 	else
    	 	{
    	 		
    	 	}
	   }
}
}
