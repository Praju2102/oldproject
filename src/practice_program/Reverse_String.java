package practice_program;
import java.util.*;
public class Reverse_String
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new string");
		String str=sc.nextLine();
		int i,count=0,add=0;
		char[]s=str.toCharArray();//string is immutable.store string in ref.//convert string into sequence of char
		//read char by char..included space.
		//reverse string program:-
		for(i=str.length()-1;i>=0;i--)
		{
			System.out.println(s[i]);
			count++;
		}
		//calculate no of vowels n consonant in string
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.charAt(i)!=' ')
			//(((str.charAt(i)>='a'&&str.charAt(i)<='z'))&&((str.charAt(i)>='A'&&str.charAt(i)<='Z'))) //not count space.
			//if(str.charAt(i)=='a'||str.charAt(i)=='A')
			switch(ch)
			{
			case 'a': 
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'I':
			case 'O':
			case 'E':
			case 'U':
				count++;
				break;
				default:
					add++;
					
			}
			
		}
		
		System.out.println(str.substring(4,6));//'4' is starting index.'6'is ending index.
		System.out.println(str.charAt(4));//4th index of char in String.
		System.out.println(str.indexOf('O'));//giving index no of char..char is repeat yhen oit will consider 1st index
		System.out.println("Total no of vowels in string "+" "+count);

		System.out.println("Total no of consonent in string "+" "+add);
	}

}
