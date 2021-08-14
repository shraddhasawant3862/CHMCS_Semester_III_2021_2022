//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 14TH Aug 2021
//PRAC-05: THREADS

import java.io.*;
import java.util.*;
public class P5_Q2_Primes_SS{
      public static void main(String args[]){
           try{
                  P5_Q2_PrimeThread_SS pt=null;
                  System.out.print("Enter a number > ");
                  Scanner scan= new Scanner(System.in);
                  int limit= scan.nextInt();
                  System.out.print("Enter a file name to store the results > ");
                  String fName= scan.next();
                  if(fName.length() >0)
                    pt= new P5_Q2_PrimeThread_SS(limit, new FileOutputStream(fName));
             else
                    pt= new P5_Q2_PrimeThread_SS(limit);
              pt.run();
           }catch(Exception e){
                        e.printStackTrace();
           }
      }//main ends
}//class ends
            