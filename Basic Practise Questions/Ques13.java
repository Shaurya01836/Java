// Given an integer array nums, return true if any value appears at least twice in the 
// array, and return false if every element is distinct. 

import java.util.Scanner;

public class Ques13 {
    static boolean checkArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int array[] = new int[5];
        System.out.print("Enter number :");
        for (int i = 0; i < array.length; i++) {
            num = s.nextInt();
            array[i] = num;
        }
        s.close();
        if (checkArray(array)) {
            System.out.println("Yes array repeats the value");
        } else {
            System.out.println("No array does not repeats the value");
        }
    }
}
