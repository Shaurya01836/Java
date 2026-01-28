package BitManipulation;

import java.util.Scanner;

public class NumberToBinary {

    static String toBinary(int num) {
        StringBuilder str = new StringBuilder();

        while (num > 0) {
            int rem = num % 2;
            str.insert(0, rem);
            num = num / 2;
        }

        return str.toString();
    }

    static int toDecimal(String num) {
       int decimal = 0 ;
       for(int i = num.length()-1 ; i >= 0 ; i--){
          decimal += (int) (Character.getNumericValue(num.charAt(i)) * Math.pow(2 , num.length() - i -1 ));
       }

       return decimal ;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number you want to convert into binary form : ");
        int num = new Scanner(System.in).nextInt();
        String binary = toBinary(num);
        System.out.println("binary form of " + num + ": " + binary);
        int decimal = toDecimal(binary);
        System.out.println("decimal form of " + binary + ": " + decimal);
    }

}
