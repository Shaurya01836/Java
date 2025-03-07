import java.util.Scanner;

class base {
    int x, y;
    Scanner s = new Scanner(System.in);

    base() {
        System.out.println("Base class Constructor");
    }

    void setData() {
        System.out.print("Enter the value of x : ");
        this.x = s.nextInt();
        System.out.print("Enter the value of y : ");
        this.y = s.nextInt();
    }

    void showData() {
        System.out.println("The value of x : " + x);
        System.out.println("The value of y : " + y);
    }
}

class derived extends base {
    int x, y;

    derived() {
        System.out.println("Derived class Constructor");
    }

    void manipulateBase() {
        System.out.print("Enter the value of x : ");
        super.x = s.nextInt();
        System.out.print("Enter the value of y : ");
        super.y = s.nextInt();
    }
}

public class Inherit {
    public static void main(String[] args) {
        derived d1 = new derived();
        d1.setData();
        d1.manipulateBase();
        d1.showData();
    }
}
