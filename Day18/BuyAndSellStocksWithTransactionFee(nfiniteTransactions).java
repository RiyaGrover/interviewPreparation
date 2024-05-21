// Question = https://www.youtube.com/watch?v=pTQB9wbIpfU

//answer = 5 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  public static void main(String[] args) {
     
     int [] arr = {2,4,6,7,1,3,2,5,4,7};
     int n = arr.length;

     int fee = 3; 

     int obsp = -arr[0];
     int ossp =0;

     for (int i = 0 ; i < n ; i++){

      int nbsp = 0;
      int nssp =0;
      // for buying purpose
if(ossp - arr[i] > obsp){
  nbsp = ossp-arr[i];
} else {
  nbsp = obsp;
}


if(obsp + arr[i] - fee > ossp){
  nssp =  obsp + arr[i] - fee;
} else {
  nssp = ossp;
}

obsp = nbsp;
ossp = nssp;
     }
System.out.println(ossp);
     
     }

}