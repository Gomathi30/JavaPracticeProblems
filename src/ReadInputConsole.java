import java.util.Scanner;
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
public class ReadInputConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a positive number");
		int number=in.nextInt();
		if(number>=0)
		{	
			for(int i=1;i<=number;i++)
				System.out.println(number+ "*"+ i+ "=" +number*i);
		}
			
		else
			System.out.println(" Please Enter a Positive Number");

	}

}
