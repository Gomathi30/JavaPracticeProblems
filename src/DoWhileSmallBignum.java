import java.util.Scanner;

public class DoWhileSmallBignum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner in = new Scanner(System.in);
			char continu='y';
			int num,i,largeno=0,smallno=Integer.MAX_VALUE;
			do {
			System.out.println("Enter First number");
			
			num=in.nextInt();
			if(num>=largeno)
				largeno=num;
			if(num<=smallno)
				smallno=num;
			
			System.out.println("Do u want to continue");
			continu=in.next().charAt(0);
			//System.out.println("contine"+continu);
			}while(continu=='y'||continu=='Y');
			System.out.println("Positive no "+ largeno);
			System.out.println("Small no " + smallno);
			
		}

	}


