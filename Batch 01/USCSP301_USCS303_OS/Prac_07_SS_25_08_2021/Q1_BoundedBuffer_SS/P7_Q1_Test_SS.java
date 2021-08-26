//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 25th  Aug, 2021
//PRAC-07: SNYCHRONIZATION

import java.util.concurrent.*;
public class P7_Q1_Test_SS
{
  public static void main(String args[])
 {
  ExecutorService application = Executors.newCachedThreadPool();
  P7_Q1_CircularBuffer_SS sharedLocation = new P7_Q1_CircularBuffer_SS();
  sharedLocation.displayState("Initial State");
  application.execute(new P7_Q1_Producer_SS(sharedLocation));
  application.execute(new P7_Q1_Consumer_SS(sharedLocation));
  application.shutdown();
}
}