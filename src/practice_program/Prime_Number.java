package practice_program;
import java.util.Scanner;
public class Prime_Number 
{ 
	
	public static void main(String[]args)
	{
		/*int x=0,y=1,n,count=0;
		
		System.out.println("enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		//***************program of to find whether the n  number is prime or not*******************
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				
				count++;
			
			}
			
		}
     if(count==2)
        {
        	//System.out.println("   prime" );
        }
        else 
        {
        	//System.out.println("  not prime");
        
        }*/
       
		
		//***********to print prime no bet 1-n***************
		 //System.out.println("Prime numbers between 1 to "+n+" are ");
			int t=0,n,j;
			int total=0;
		for( j=2;j<=10;j++)//no to check
		{
			int sum=0;
			for(int i=1;i<=j;i++)//diving the no
			{
				if(j%i==0)
				{
					sum++;
				}
			}
		
		    if(sum==2)
		   {
			
			System.out.println(j+" ");
		
			//t++;
			//total=total+j;
			
		    }
		
		
	    }
		//System.out.println("total no of prime no" +" " +t);
		//total prime no 
		//System.out.println("total no of prime no" +" " +total);
	}


}

