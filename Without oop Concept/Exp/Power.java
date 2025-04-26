package Exp;

public class Power {

    public static void main(String[] args) {

    }

    public static void power(int num, int power) {

        if (power == 0) {
            num = 1;
            System.out.println(num);
            return;
        }
        int temp = num;
        for (int i = 1; i < power; i++) {
            num *= temp;
        }
        System.out.println(num);
    }

}
