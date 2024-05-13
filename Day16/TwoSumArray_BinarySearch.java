// Java program to check if given array
// has 2 elements whose sum is equal
// to the given value

//Time Complexity: O(NlogN)
// Auxiliary Space: O(1)
import java.util.*;



class Main{
     static boolean isSumEqual(int A[] , int low , int high, int searchKey){

  while(low<=high){
    int m = low + (high-low)/2;

    if(A[m] == searchKey){
       System.out.println(A[m]);
        return true;
       
    }else if(A[m] < searchKey){
        low = m+1;
        
    
    } else {
        high = m-1;
    }

  }
  return false;

     }

     static  boolean CheckSum(int A[] , int size , int sum){

        Arrays.sort(A);

        for(int i = 0;  i< size-1;i++){

// -8+x=14 => x = 14-(-8); => x = sum - A[i]
       int searchKey = sum - A[i];

            if (isSumEqual(A, i + 1, size - 1,
                             searchKey)
                == true) {
                return true;
            }
        }

        return false;
    }
     public static void main(String args[])
    {
        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 14;
        int size = A.length;

        // Function calling
        if (CheckSum(A, size, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
     }
