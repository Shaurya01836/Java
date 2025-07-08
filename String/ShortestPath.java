import java.util.Scanner;

public class ShortestPath {

    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            //north
            if (direction == 'N' || direction == 'n') {
                y++;
            }
            //south
            else if (direction == 'S' || direction == 's') {
                y--;
            }
            //east
            else if (direction == 'E' || direction == 'e') {
                x++;
            }
            //west
            else if (direction == 'W' || direction == 'w') {
                x--;
            } else {
                System.out.println("Wrong input !");
                return -1;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your path : ");
        String path = sc.next();
        if (shortestPath(path) != -1) {
            System.out.println("Your shortest path is : " + shortestPath(path));
        }

    }
}
