import java.util.Scanner;

public class PowerFunc {
//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=in.nextInt();
		int num2=in.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		int pow=1;
		for (int i=1;i<=num2;i++) {
			System.out.println("i"+i);
			pow=pow*num1;
		}
		System.out.println("Power "+pow);
	}

}
