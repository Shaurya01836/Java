import java.util.Scanner;

public class PredictingAge {

    public static int predictAge(int currYear, int birthYear) {
        int age = 0;
        if (birthYear > currYear) {
                age = currYear - birthYear;
                if(age < 0 ){
                    age = 100 + age;
                }
        } else {
            age = currYear - birthYear;
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currYear, birthYear = 0;

        System.out.print("Enter your birth Year : ");
        birthYear = sc.nextInt();

        System.out.print("Enter current Year : ");
        currYear = sc.nextInt();

        System.out.println("Your age would be : " + predictAge(currYear, birthYear));
    }

}
