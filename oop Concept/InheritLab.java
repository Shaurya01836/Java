import java.util.Scanner;

class employee {
    int EmployeeId;
    String EmployeeName;
    String EmployeeDesignation;
    Scanner s = new Scanner(System.in);

    employee() {
        EmployeeName = "";
        EmployeeDesignation = "";
    }

    void setData() {
        System.out.print("Enter Employee ID : ");
        EmployeeId = s.nextInt();
        System.out.print("Enter Employee Name : ");
        EmployeeName = s.next();
        System.out.print("Enter Employee Designation : ");
        EmployeeDesignation = s.next();
    }

    void showData() {
        System.out.println("Employee Details : ");
        System.out.println("Employee ID : " + EmployeeId);
        System.out.println("Employee Name : " + EmployeeName);
        System.out.println("Employee Designation : " + EmployeeDesignation);
    }

}

class salary extends employee {
    double salary, allowances, pf;

    void calcSalary() {
        System.out.print("Enter your Gross Salary :");
        salary = s.nextDouble();
        System.out.print("Enter your allowances :");
        allowances = s.nextDouble();
        System.out.print("Enter your pf :");
        pf = s.nextDouble();
        salary = (salary + allowances) - pf;
    }

    void showSalary() {
        System.out.print("Your Net(in Hand) Salary :" + salary);
    }
}

public class InheritLab {
    public static void main(String[] args) {
        salary s1 = new salary();
        s1.setData();
        s1.calcSalary();
        s1.showData();
        s1.showSalary();
    }
}
