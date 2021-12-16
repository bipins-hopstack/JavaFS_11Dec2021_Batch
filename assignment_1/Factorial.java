package assignment_1;

public class Factorial {
//Declaration
	 
	
	public int factorial(int n)
	{	int  fact=1; 
		for(int i=1;i<=n;i++)
		{
	   
		fact=fact*i;
		//System.out.println("fact===="+fact+"n====="+n+"====i"+i);
					
     	}
		return fact;
}
}
