import java.io.*; 
import java.util.Scanner;

class Main
{ 
	
	public static void main(String arg[]) 
	{ 
		
		int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
		
		for (int i = 1; i <= 10; ++i) 
			System.out.println( n * i); 
	} 
} 


