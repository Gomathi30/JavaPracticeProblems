import java.util.Scanner;

public class CntPostngtvzero {
//Write a program to enter the numbers till the user wants and 
	//at the end it should display the count of positive, negative and zeros entered. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char continu='y';
		int num,i,postivecnt=0,negcount=0,zerocount=0;
		do {
		System.out.println("Enter First number");
		
		num=in.nextInt();
		if(num==0) zerocount++ ;
		if(num>0) postivecnt++ ;
		if(num<0) negcount++;
		
		System.out.println("Do u want to continue");
		continu=in.next().charAt(0);
		//System.out.println("contine"+continu);
		}while(continu=='y'||continu=='Y');
		System.out.println("Positive no count"+ postivecnt);
		System.out.println("Negative count" + negcount);
		System.out.println ("Zero count " +zerocount);
	}

}
