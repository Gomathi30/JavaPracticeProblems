import java.util.Scanner;
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
public class ReverseInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int number=in.nextInt();
		int revnum=0;
        int remainder; 	
		while(number>0)//123
		{
			revnum=revnum*10;
			remainder= number%10;
			number=number/10;
			revnum=revnum+remainder;
			
		}
		
				System.out.print(revnum);

	}

}
