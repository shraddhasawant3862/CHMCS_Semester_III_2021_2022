//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 14TH Aug 2021
//PRAC-05: THREADS

import java.io.*;

class P5_Q2_PrimeThread_SS extends Thread{
    private PrintStream pOut= null;
    private int limit= 0;

   //default constructor.does nothing
   public P5_Q2_PrimeThread_SS(){
   }

   //construct to set the number below which to generate primes
   public P5_Q2_PrimeThread_SS(int I){
       limit= I;
       try {
               pOut= System.out;
       } catch(Exception e){
               e.printStackTrace();
       }
     }

    //consrtuct that sets both the number, as above, and specifies an output stream
    public P5_Q2_PrimeThread_SS(int I, OutputStream outS){
             limit= I;
              try{
                   if(outS!= null){
                                      pOut= new PrintStream(outS);
                         }else{
                                     pOut= System.out;
                         }
               }catch(Exception e){
                            e.printStackTrace();
               }
       }
       //method that performs the work of the thread
        public void run(){
                      boolean numbers[]= new boolean[limit+1];
                      numbers[0]= false;
                      numbers[1]= false;
                      for(int i=2; i<numbers.length; i++){
                            numbers[i]= true;
                 }
           for(int i= 2; i<numbers.length; i++){
              if(numbers[i]){
                for(int j=(2*i); j<numbers.length; j+=i){
                       numbers[j]= false;
                  }//inner for ends
             }//if ends
            }//outer for ends
            for(int i=0; i<numbers.length; i++){
               if (numbers[i])
                  pOut.println(i);
             }//for ends
       }//run ends
}//class ends