package practice_program;
import java.util.*;
public class TotalNo_CharString 
{
public static void main(String args[])
{
	//String str="prajakta sagane";
	System.out.println("enter the String:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(str);
	int count=0;
	//for(int i=0;i<str.length();i++)
	//for(int i=0;i<=str.length()-1;i++)
	for(int i=str.length()-1;i>=0;i--)
	{
		 if(str.charAt(i) != ' ') 
			 //to avoid space counting 
			 
		count++;
	}
	
	System.out.println("total no of char in string"+" "+count+" "+str);
	
	
	
	
	
	
}
}
