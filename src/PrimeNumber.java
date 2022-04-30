import java.util.Scanner;

public class PrimeNumber {
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a positive number");
		int num1=in.nextInt();
		char flag='Y';
		if (num1<=0)
			System.out.println("Please enter a positive number");
		if (num1==1)
			System.out.println("1 is not a prime number");
		 if (num1>1)
		{
			for(int i=2;i<num1;i++)
			{
				if(num1%i ==0)
				{
					
					flag='N';
					System.out.println("it is not a prime number");	
					break;
				}
			
		}
			if(flag== 'Y') {
				System.out.println("it is a prime number");	
				}	
				
	}

	}
}
