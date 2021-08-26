//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 25th  Aug, 2021
//PRAC-07: SNYCHRONIZATION

import java.util.Random;
public class P7_Q1_Consumer_SS implements Runnable
{
  private final static Random generator = new Random();
  private final P7_Q1_Buffer_SS sharedLocation;
  public P7_Q1_Consumer_SS(P7_Q1_Buffer_SS shared)
  {
    sharedLocation = shared;
  }
public void run()
{
  int sum = 0;
  for(int count =1; count <=10; count++)
  {
   try{
         Thread.sleep(generator.nextInt(3000));
          sum += sharedLocation.get();
    }catch(InterruptedException e){
     e.printStackTrace();
  }
}
System.out.printf("\n%s %d\n%s\n", "Consumer read values totalling", sum, "Terminating Consumer");
}//run() ends
}// Consumer class ends