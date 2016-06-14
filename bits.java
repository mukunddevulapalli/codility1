/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int bits(int a,int b){
		
		int N=a*b;
		int count=0;
		
		while(N/2>0){
			
			if(N%2==1)
				count++;
			N=N/2;
		}
		
			
			if(N%2==1)
				count++;
		
		return count;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String s=b.readLine();
		String [] st=s.split(" ");
		int a,b;
		a=Integer.parseInt(st[0]);
		b=Integer.parseInt(st[1]);
		
		System.out.println(bits(a,b));
	}
}
