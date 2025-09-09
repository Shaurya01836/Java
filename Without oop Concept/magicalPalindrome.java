import java.util.Scanner;

public class magicalPalindrome {

    public static int reverseNum(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = (reversedNum * 10) + num % 10;
            num = num / 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int reversedNum = 0 ;
        boolean flag = false;
        while (!flag) {
            reversedNum = reverseNum(num);
            if (reversedNum == num){
                flag = true;
            }
            else{
                num = reversedNum + num;
            }
        }
        System.out.println(reversedNum);
    }

}
