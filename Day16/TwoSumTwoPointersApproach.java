//Time Complexity: O(NlogN), Time complexity for sorting the array
// Auxiliary Space: O(1)


import java.util.*;
class Main{

    static boolean isEqual(int A[] , int size , int sum){
        int l, r;

        Arrays.sort(A);

        l=0;
        r = size-1;

        while(l < r){
            if(A[l] + A[r] == sum){
                return true;
            } else if(A[l] + A[r] < sum){
                l++;
            }else {
                r--;
            }
        }
        return false;
    }

     public static void main(String args[])
    {
        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        int size = A.length;

        // Function calling
        if (isEqual(A, size, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}

