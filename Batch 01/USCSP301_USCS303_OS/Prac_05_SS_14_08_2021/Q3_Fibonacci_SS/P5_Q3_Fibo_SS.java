//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 14TH Aug 2021
//PRAC-05: THREADS

import java.util.ArrayList;
import java.util.Scanner;

public class P5_Q3_Fibo_SS
{
    public static void main(String args[]){
      Scanner scan= new Scanner(System.in);
      ArrayList al= new ArrayList();
      int a;
      System.out.print("Enter the number: ");
      a= scan.nextInt();
      P5_Q3_FiboThread_SS fibTh= new P5_Q3_FiboThread_SS(a);
      fibTh.start();
      try{
             fibTh.join();
     }catch(InterruptedException ex){
              ex.printStackTrace();
      }
         int fseries[]= fibTh.arr;
          System.out.println("First" +a+ "fibonacc numbers are: ");
         for(int i= 0; i<a; i++){
              System.out.print(fseries[i]+ "  ");
      }
  }//main ends
}//class ends
class P5_Q3_FiboThread_SS extends Thread
{
    private int a, i;
    Thread t;
     int arr[];

     public P5_Q3_FiboThread_SS(int a) {
      this.a = a;
      arr=new int[a];
 }
  public void run(){
       arr[0]= 0;
        arr[1]= 1;
       for(i= 2; i< a; i++){
            arr[i]= arr[i- 1]+arr[i-2];
       }
   }//run ends
}//class ends