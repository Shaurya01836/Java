// 7. Programs to demonstrate basic concepts e.g. operators, classes, 
// constructors, control & iteration statements, recursion etc. such as complex 
// arithmetic, matrix arithmetic, tower of Hanoi problem etc.

import java.util.Scanner; 
  
public class MatrixMultiplication 
{ 
    public static void main(String args[]) 
    { 
        int n; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the base of squared matrices"); 
        n = sc.nextInt(); 
        int[][] a = new int[n][n]; 
        int[][] b = new int[n][n]; 
        int[][] c = new int[n][n]; 
        System.out.println("Enter the elements of 1st matrix row wise \n"); 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                a[i][j] = sc.nextInt(); 
            } 
        } 
        System.out.println("Enter the elements of 2nd matrix row wise \n"); 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                b[i][j] = sc.nextInt(); 
            } 
        } 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                for (int k = 0; k < n; k++) 
                { 
                    c[i][j] = c[i][j] + a[i][k] * b[k][j]; 
                } 
            } 
        } 
        System.out.println("The product is:"); 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                System.out.print(c[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
}