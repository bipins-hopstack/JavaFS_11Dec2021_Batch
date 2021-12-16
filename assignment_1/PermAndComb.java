package assignment_1;

import java.util.Scanner;

public class PermAndComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variables
		Scanner sc= new Scanner(System.in);
		int perm,comb,n,r;
		
		
		System.out.println("Input 'n' For computing nCr and nPr \n");
		n=sc.nextInt();
		System.out.println("Input 'n' For computing nCr and nPr \n");
		r=sc.nextInt();
		Factorial fact=new Factorial();
		
		
		sc.close();
		// Computation of permutation nPr= n!/(n-r)!
		
		perm=fact.factorial(n)/fact.factorial(n-r);
		
		// Computation of Combination nCr= n!/(n-r)!*r!
		comb=perm/fact.factorial(r);
		
		System.out.println("nPr for the given input is =="+perm);
	    System.out.println("nCr for given inputs is =="+comb);
		
	}

}
