// In a program,input the side of a square.You have to output the area of the square.(Hint : area of a square is (side x side))

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int side;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side of the square :");
        side = s.nextInt();
        System.out.println("The area of the square is " + side * side);
        s.close();
        
    }
}
