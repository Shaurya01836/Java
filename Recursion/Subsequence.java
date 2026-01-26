package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    static void findSubsequence(int[] arr,int idx ,  List<Integer> list) {
            if(idx >= arr.length ) {
                System.out.println(list);
                return;
            }
            list.add(arr[idx]) ;
            findSubsequence(arr , idx + 1 , list);
            list.removeLast() ;
            findSubsequence(arr , idx + 1 , list);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        List<Integer> list = new ArrayList<>();
        System.out.println("Original Array :");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        findSubsequence(arr ,0 ,  list);

    }

}
