package practice_program;

public class ReverseArray 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,2,4,5};
		
		for(int i=0;i<a.length;i++)//for displaying array.
		{
			System.out.println(a[i]);
			
		}
		for(int i=a.length-1;i>=0;i--)//reverse array
		{
			System.out.println(a[i]);
		}
		for(int i=1;i<=a.length;i=i+2)//to print even position no
			
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);//odd position no
		
		}
	}

}
