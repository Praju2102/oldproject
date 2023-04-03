package practice_program;
public class Ascending_Array 
{
	public static void main(String args[])
	{
		int a[]= {2,1,4,6};
		int x;
		System.out.println("I.ORIGINAL ARRAY");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("_________________________");
		
		System.out.println("II.ASCENDING ARRAY");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)//ascending order
			{
				if(a[i]>a[j])//for ascending order 
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("_________________________");
		
		System.out.println("III.DESCENDING ARRAY");
		for(int i=0;i<a.length;i++)
		{

			for(int j=i+1;j<a.length;j++)//descending order
			{
				if(a[i]<a[j])//for descending order 
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
			System.out.println(a[i]);
			
		}
	}

}
