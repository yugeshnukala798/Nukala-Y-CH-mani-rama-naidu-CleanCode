package com.epam.CleanCode;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Select an option that you want to do : ");
    	System.out.println("1.Calculating Interests"+"\n"+"2.Estimating Construction Cost");
    	Scanner in = new Scanner(System.in);
    	int op = in.nextInt();
    	if(op == 1) {
            Interest interestObject = new Interest();
            System.out.print("Enter principle : ");
            float principle = in.nextFloat();
            System.out.print("Enter rate of interest : ");
            int rate = in.nextInt();
            System.out.print("Enter time in years : ");
            int timeInYears = in.nextInt();
            System.out.println("Simple Interest : " + interestObject.simpleInterest(principle,timeInYears,rate));
            System.out.printf("Compound Interest : %.2f",interestObject.compoundInterest(principle,timeInYears,rate));
    	}
    	else if(op == 2) {
    		System.out.println("Select a type of material  standard : "+"\n"+"1.standard materials"+"\n"+"2.above standard materials"+"\n"+"3.high standard material"+"\n"+"4.high standard material and fully\r\n" + 
    				"automated home");
    		int type = in.nextInt();
    		System.out.println("Enter Area : ");
    		int area = in.nextInt();
    		Estimation estimationObject = new Estimation(type,area);
    		System.out.println("Your estimated cost is "+estimationObject.costEstimation());
    	}
    	else {
    		System.out.println("Invalid option");
    	}
    	in.close();
    }
}
