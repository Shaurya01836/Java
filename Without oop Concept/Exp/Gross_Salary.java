package Exp;

public class Gross_Salary {

    public static float net_salary(float Gross_Salary, float income_Tax, float ppf, float tax) {
        float net_salary = Gross_Salary - income_Tax - ppf - tax;
        return net_salary;
    }

    public static float salary(float monthly_Expense , float net_salary){
        float Salary = net_salary-monthly_Expense;
        return Salary;
    }

    public static void main(String[] args) {

    }
}
