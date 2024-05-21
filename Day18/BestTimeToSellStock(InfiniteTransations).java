// Question - https://www.youtube.com/watch?v=HWJ9kIPpzXs


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  public static void main(String[] args) {
     
     int [] arr = {2,4,6,7,1,3,2,5,4,7};
     int n = arr.length;


     int buyingDate = 0;
     int sellingDate = 0;
     int profit =0;

     for(int i =1; i < n ; i++){
      if(arr[i] >= arr[i-1]){
        sellingDate++;

      } else {
        profit += arr[sellingDate]- arr[buyingDate];
        buyingDate=sellingDate=i;
      }
     }
     profit += arr[sellingDate]- arr[buyingDate];
     System.out.println(profit);
  }

}