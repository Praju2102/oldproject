package practice_program;
import java.util.*;
public class SwapStr_Without3rdStr 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.println("enter string 1");
    String str1=sc.nextLine();
    System.out.println("enter string 2");
    String str2=sc.nextLine();
    str1=str1 + str2;
    str2= str1.substring(0, (str1.length() - str2.length())); 
    str1 = str1.substring(str2.length()); 
   System.out.println("After swapping:"+ " "+str1+" "+str2);
   
}
}
