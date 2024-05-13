//Time Complexity: O(N), As the whole array is needed to be traversed only once.
// Auxiliary Space: O(N), A hash map has been used to store array elements.

import java.io.*;
import java.util.HashSet;

class Main{

    static void printpairs(int A[] , int sum){

        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            int temp = sum - A[i];

            if(h.contains(temp)){
                System.out.println("yes");
                return;

            }

            h.add(A[i]);
        }

        System.out.println("no");
    }



  public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }
}