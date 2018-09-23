/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{	Scanner sc = new Scanner(System.in);
		try{
		// your code goes here
	
		int i = sc.nextInt();
		if(i>0){
			System.out.println("positive");
		}
		else{
			System.out.println("zero");
		}
		}
		catch(Exception e){System.out.println(e);}
	}
}
