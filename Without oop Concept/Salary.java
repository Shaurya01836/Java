import Exp.Gross_Salary;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        float monthly_Expense = 0f;
        Gross_Salary g = new Gross_Salary();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scn.next();
        System.out.println("Enter your Gross Salary : ");
        float grossSalary = scn.nextFloat();
        System.out.println("Enter your Income tax : ");
        float incomeTax = scn.nextFloat();
        System.out.println("Enter your Public Provided Fund : ");
        float ppf = scn.nextFloat();
        System.out.println("Enter your Public Professional tax : ");
        float ProfessionalTax = scn.nextFloat();

        float netSalary = g.net_salary(grossSalary, incomeTax, ppf, ProfessionalTax);

        System.out.println("Your net salary is : " + netSalary);

        try {
            System.out.println("Enter your monthly expense : ");
            monthly_Expense = scn.nextFloat();
            if (monthly_Expense > netSalary) {
                throw new Exception("Your MOnthly expense is more than the net salary");
            } else {

                float salary = g.salary(monthly_Expense, netSalary);
                System.out.println("Your Monthly salary after expense : " + salary);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
