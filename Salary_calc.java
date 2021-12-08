import java.util.Scanner;		// for user to input

public class Salary_calc {
    public static void main(String[] args) {
		        
    			Scanner s = new Scanner(System.in);				// Scanner variable
    			System.out.print("Your Annual Salary			: ");		// Asking user to input its annual salary
    			float annuSalary = s.nextFloat();							// Annual salary variable
    			double tax_deduction = 0;									// Tax_deduction variable	
		        
		        
		        if(annuSalary < 250000){									// if - else if - else statement
		        	float Monthly_Rate = annuSalary / 12;					
		            float Daily_Rate = Monthly_Rate / 22;					// since annual salary less than 250000				
		            float Hourly_Rate = Daily_Rate / 8;						// has no tax deduction, I separate its
		            float Net_Pay = Monthly_Rate;							// formula

		            System.out.println("Your Monthly Rate			: " + String.format("%.2f", Monthly_Rate));
		            System.out.println("Your Daily Rate				: " + String.format("%.2f", Daily_Rate));		// to output
		            System.out.println("Your Hourly Rate			: " + String.format("%.2f", Hourly_Rate));
		            System.out.println("Your Annual Tax Deduction	: 0 ");
		            System.out.println("Monthly Tax Deduction 		: 0");
		            System.out.println("Net Pay						: " + String.format("%.2f", Net_Pay));
		        }
		        else if(annuSalary >= 250000 && annuSalary < 400000){
		             tax_deduction = annuSalary - 150000 * 0.20;
		        }
		        else if(annuSalary >= 400000 && annuSalary < 800000){
		            float tax_excess = annuSalary - 400000;
		             tax_deduction = 0.25 * tax_excess + 30000;
		        }
		        else if(annuSalary >= 800000 && annuSalary < 2000000){
		            float tax_excess = annuSalary - 1800000;
		             tax_deduction = 0.30 * tax_excess + 130000;
		        }
		        else if(annuSalary >= 2000000 && annuSalary < 8000000){
		            float tax_excess = annuSalary - 6000000;
		             tax_deduction = 0.32 * tax_excess + 490000;
		        }
		        else{
		            float tax_excess = annuSalary - 8000000;
		             tax_deduction = 0.35 * tax_excess + 2410000;
		        }
		        
		
		        float Monthly_Rate = annuSalary / 12;						
		        float Daily_Rate = Monthly_Rate / 22;							// formula of annual salary greater than 250000
		        float Hourly_Rate = Daily_Rate / 8;
		        double Annual_Tax_Deduction = tax_deduction;
		        double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
		        double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

		        System.out.println("Your Monthly Rate			: " + String.format("%.2f", Monthly_Rate));
		        System.out.println("Your Daily Rate				: " + String.format("%.2f", Daily_Rate));
		        System.out.println("Your Hourly Rate			: " + String.format("%.2f", Hourly_Rate));					// to output the data
		        System.out.println("Your Annual Tax Deduction		: " + String.format("%.2f", Annual_Tax_Deduction));
		        System.out.println("Monthly Tax Deduction			: " + String.format("%.2f", Monthly_Tax_Deduction));
		        System.out.println("Net Pay					: " + String.format("%.2f", Net_Pay));

    
    
    }
}