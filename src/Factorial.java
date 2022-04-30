import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Input");
		int number= in.nextInt();
		if (number< 0)
			System.out.println("Enter Positive number");
		if (number== 0 || number==1)
			System.out.println("Factorial is 1");
		else  {
			for (int i=2;i<=number;i++)
				fact=fact*i;
			System.out.println("Factorial is "+ fact);
		}
		
	}

}
