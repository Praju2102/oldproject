package practice_program;
public class CopyArray 
{
public static void main(String []args)
{
	int a[]={1,2,1,3,3,4};
	//int b[]= new int[a.length];
	int b[]= a;
	

	/*for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
		
	}*/
	System.out.println("Elements of  array: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	//System.out.println();*/
	System.out.println("Elements of new array: ");
	for(int i=0;i<b.length;i++)
	{
		//b[i]=a[i] 
		
		System.out.println(b[i]);
		}
	}

	 
}


