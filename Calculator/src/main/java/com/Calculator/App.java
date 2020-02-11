package com.Calculator;
import java.util.*;

public class App 
{
    	public static void main( String[] args )
        {
        	System.out.println("This is a calculator to perform the operations you have to send parameters as\nfor add: addition,add,+\nfor subtraction: sub,subtraction,-\nfor multiplication: mul,multiply,*\nfot division:div,division,/\nfor modulo:mod,modulo,%");
            boolean condition=true;
            double num1,num2;
            Scanner sc = new Scanner(System.in);
            while(condition)
            {
            	System.out.print("entre the numbers on which you want to apply operation : ");
            	num1 = sc.nextDouble();
            	num2 = sc.nextDouble();
            	sc.nextLine();
            	System.out.print("Enter the operation to be performed : ");
            	String Op = sc.next();
            	Calculator cal = new Calculator(num1,Op,num2);
            	cal.Result();
            	System.out.println("Do you want to perform another operation enter Y for Yes and N for No");
            	String again = sc.next();
            	if(again.equalsIgnoreCase("y"))condition = true;
            	else
            	{
            		condition = false;break;}
            }
            sc.close();
    }
}

