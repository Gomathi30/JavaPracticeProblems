import java.util.Scanner;

public class ExamDoWhile {
//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes
	//to perform the operation again. If so, the loop should repeat; otherwise it should terminate
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char continu='y';
		do {
		System.out.println("Enter First number");
		int num1,num2,i;
		num1=in.nextInt();
		System.out.println("Enter second number");
		num2=in.nextInt();
		System.out.println("sum"+ (num1+num2));
		System.out.println("Do u want to continue");
		continu=in.next().charAt(0);
		//System.out.println("contine"+continu);
		}while(continu=='y'||continu=='Y');
	}

}
