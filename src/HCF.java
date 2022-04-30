import java.util.Scanner;

public class HCF {
	
public static void main(String[] args)
{
	/*Scanner in= new Scanner(System.in);
	System.out.println("Enter First number");
	int num1,num2,i;
	num1=in.nextInt();
	System.out.println("Enter second number");
	num2=in.nextInt();
	int commfact=1;
	int min = Math.min(num1, num2);
	for (i=2;i<=min;i++)
	{
		if ((num1%i==0)&&(num2%i==0))
			commfact=i;
	}
	System.out.println("HCF:"+commfact);*/
	 Scanner console = new Scanner(System.in);
     
     int dividend, divisor;
     int remainder, hcf = 0;
     
     System.out.print("Enter the first number ");
     dividend = console.nextInt();
     
     System.out.print("Enter the second number ");
     divisor = console.nextInt();        
     
     do
	{
         remainder = dividend % divisor;
         System.out.println("Remain"+remainder);
         if(remainder == 0)
         {
             hcf = divisor;
         }
	    else
         {
             dividend = divisor;
             divisor = remainder;
	    }
         
     }while(remainder != 0);

     System.out.println("HCF: " + hcf);
}
}
