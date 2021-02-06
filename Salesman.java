/*A computer manufacturing company has the following monthly compensation policy to their sales-
persons:
Minimum base salary
: 1500.00
Bonus for every computer sold
: 200.00
Commission on the total monthly sales : 2 per cent
Since the prices of computers are changing, the sales price of each computer is fixed at the
beginning of every month*/
import java.util.*;
class Salesman
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float salary=0f,bonus=0f,commision=0f,price=0f,quantity=0f,SALARY1=1500f,BONUS1=200f,COMMISION1=0.02f;;
		System.out.println("\nEnter Quantity of computer\t:");
		quantity=sc.nextFloat();
		System.out.println("\nEnter price of each computer\t:");
		price=sc.nextFloat();
		bonus=BONUS1*quantity;
		commision=COMMISION1*quantity*price;
		salary=(SALARY1+bonus+commision);
		System.out.println("Total salary"+salary+"bonus"+bonus+"commision"+commision);
	}
}
