package practice_program;

public class LargeSmallEle 
{
	public static void main(String[]args)
	{
		int a[]=new int [] {17,389,46,58,6};
		int max=a[0],min=a[0];
		int i;
		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
			 else if(min>a[i])
			 {
				 min=a[i];
			 }
			
		}
			
		System.out.println(max);
		System.out.println(min);
		System.out.println(a.length);
	}

}
