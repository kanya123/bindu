/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int min;
	Scanner sc= new Scanner(System.in);
	min=sc.nextInt();
	int hours=min/60;
	int m=min%60;
	//System.out.println(+c" "+m);
	System.out.printf("%d %d",hours,m);
	
	}
}
