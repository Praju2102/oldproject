package practice_program;

public class Lenghofary 
{
    public static void main(String[]args)
    {
    /* int a[]=new int[5];*/
    	// int a[]=new int[5];
    	int a[]= {19,20,35,04,51,16};
    	//System.out.println("size of array is "+ a.length);
    	/*a[0]=1;
    	a[1]=2;
    	a[2]=3;
    	a[3]=4;
    	a[4]=5;//
    	
    	//System.out.println(a[3]);//this is  work.
    	/*for(int i=0;i<=5;i++)
    	{
    		System.out.println(a[i]);
    	}*/    	
    	
	/* for(int i:a)
	 {
		 System.out.println(a[i]);
		 
	 }
	 */
    	//reverse array
    	/*for(int i=a.length-1;i>=0;i--)//reverse array
    	{
    		System.out.println(a[i]);
    	}*/
    	//even n odd no nd how many even n odd no.
    	/*int odd=0,even=0;
    	for(int i=0;i<=5;i++)
    	{
    		if(a[i]%2!=0)
    		{
    			System.out.println("the odd no are "+a[i]);
    			odd++;
    			
    		}
    		else
    		{
    			System.out.println("the even no are "+a[i]);
    	even++;
    		}
    	}
    	System.out.println("odd"+ odd +" "+ "even"+ even);*/
    	int min=a[0];
    	for(int i=1;i<=a.length-1;i++)
    	{
    		if(min>a[i])
    		{
    			min=a[i];
    			
    					
    		}
    		
    	}
    	
	 System.out.println(min);

	 /*
	 int max=a[0];
 	for(int i=1;i<=a.length-1;i++)
 	{
 		if(max<a[i])
 		{
 			max=a[i];
 			
 					
 		}
 	}
 	
	 System.out.println(max);
 }*/
    }

}
