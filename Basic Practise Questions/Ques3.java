// Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        float pencil, pen, eraser, billAmount;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of the pencil :");
        pencil = s.nextInt();
        System.out.print("Enter the amount of the Pen :");
        pen = s.nextInt();
        System.out.print("Enter the amount of the Eraser :");
        eraser = s.nextInt();
        billAmount = pen + pencil + eraser;
        billAmount = (billAmount * 18) / 100 + billAmount;
        System.out.println("Your amount is :" + billAmount);
    }
}
