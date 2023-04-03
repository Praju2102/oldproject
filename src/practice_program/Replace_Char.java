package practice_program;
import java.util.*;
public class Replace_Char 
{
	public static void main(String args[])
	{
		
	
		System.out.println("enter string ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	
		//String str="prAjakTa";
		
		String a=" "; 
	
		//String s=str.toUpperCase();
		
		//System.out.println(s);
		int i=0;
		
		for( i=0;i<str.length();i++)
		{
			char s=str.charAt(i);
			if(Character.isUpperCase(s))
			{
				a+=Character.toLowerCase(s);
				
			}
			else
			{
				a+=Character.toUpperCase(s);
			}
				
		}
		System.out.println(a);
	}

}
