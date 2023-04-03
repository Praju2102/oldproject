package practice_program;

public class Add_Of_Array 
{ 
	public static void main(String []args)
	{
		int a[]=new int [] {1,2,3,2,3,1};
		int count=0,total=0;
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];//add of elem of array//
			
		}
		for(int i=0;i<a.length;i++)
		{
			count++;//add of elem of array//
			
		}
		System.out.println(count+ " "+ total);
	}

}
