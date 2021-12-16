package assignment_1;

import java.util.Scanner;

public class MultiplicationTables {
	static int n;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no to generate Multiplication Tables");
		n = sc.nextInt();
		
		sc.close();
		/*
		 * //System.out.println(); SwingUtilities.invokeLater(new Runnable(){ public
		 * void run() { new MultiplicationTables(); } });
		 */
		System.out.println("Multiplication Tbale of " + n + " is : ");
		for(int i=1;i<=10;i++) {
			int mul=n*i;
			String formateTable=n+"x"+i+"="+mul;
			System.out.println(formateTable);
			
			
		}
	}
}
