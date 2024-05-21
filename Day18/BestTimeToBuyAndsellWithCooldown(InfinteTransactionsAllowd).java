// Question - https://www.youtube.com/watch?v=GY0O57llkKQ



public class Main {
  public static void main(String[] args) {
     
     int [] arr = {10,15,17,20,16,18,22,20,22,20,23,25};
     int n = arr.length;


     int obsp = -arr[0];
     int ossp =0;
     int ocsp =0;

     for(int i =1 ; i < n ; i++){

       int nbsp = 0;
     int nssp =0;
     int ncsp =0;

      if(ocsp -arr[i] > obsp){
        nbsp = ocsp -arr[i];
      } else {
        nbsp = obsp;
      }


      if(obsp +arr[i] > ossp){
        nssp = obsp + arr[i];
      } else {
        nssp = ossp;
      }

      if(ossp > ocsp){
        ncsp = ossp;
      } else {
        ncsp = ocsp;
      }

      ncsp = ocsp;
      nbsp = obsp;
      nssp = ossp;

     }

     System.out.println(ossp);
    
  }
}