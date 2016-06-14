/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int braces(char [] a){
		
		int i=0;
		int j=a.length-1;
		
		while(i<j){
		
			for(;i<a.length && i<=j;i++){
				
				if(a[i]=='(')
					break;
			}
		
		
			for(;j>=0 && j>=i;j--){
			
				if(a[j]==')')
					break;
			}
		
			
			if(i>=j)
				return i;
			
			i++;
			j--;
		
			}
	
		return i;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String s=b.readLine();
		System.out.println(braces(s.toCharArray()));
	}
}
