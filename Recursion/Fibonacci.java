import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int num) {
      if (num ==1 || num == 0){
          return num;
      }
        int f1 = fibonacci(num - 1);
        int f2 = fibonacci(num - 2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(fibonacci(num));
    }
}
