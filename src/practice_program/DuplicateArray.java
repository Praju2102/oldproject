package practice_program;
public class DuplicateArray 
{
	
	public static void main(String[]args)
	{
		int arr[]= {4,5,4,3,45,6,7,4,3,2,4};

	  for(int i = 0; i < arr.length; i++) {  
         for(int j = i + 1; j < arr.length; j++)
		  {  
              if(arr[i] == arr[j])  
                  System.out.println(arr[j]);  
          } 
	  }
	}
	
}
