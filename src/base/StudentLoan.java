package base;
import java.util.Scanner;

public class StudentLoan {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial tuition."); //asks user for initial tuition
		double initialTuition = input.nextDouble();
		
		System.out.println("Enter the percent increase."); //asks user for percent increase
		double percentInc = input.nextDouble();
		
		System.out.println("Enter the repayment APR."); //asks user for repayment APR 
		double APR = input.nextDouble();
	
		System.out.println("Enter the repayment term (in years)."); //ask user for repayment term
		double term = input.nextDouble();

		double a = initialTuition;
		double b = percentInc+1;
		double CostOfTuition = a+Math.pow(a, b)+Math.pow(a, b*b)+Math.pow(a, b*b*b); //compute total cost of tuition 
		System.out.printf("The total tuition cost is %.2f%n" , CostOfTuition); 
		double r = APR/12;
		double monthlyPayment = CostOfTuition*r/(1-Math.pow(1+r,-1*term*12));
		System.out.printf("Your monthly payment will be %.2f", monthlyPayment); //compute monthly cost of tuition
		
		input.close();
	}
}

