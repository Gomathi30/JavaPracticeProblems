import java.util.Scanner;

public class SumOfEvenOdd {
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int oddsum=0,evensum=0;
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("Enter number "+ i);
			int number=in.nextInt();
			if(number%2==0)
				evensum+=number;
			else
				oddsum+=number;
		}
		System.out.println("Sum odd number "+ oddsum);
		System.out.println("sum even number "+ evensum);
			
			
	}

}
