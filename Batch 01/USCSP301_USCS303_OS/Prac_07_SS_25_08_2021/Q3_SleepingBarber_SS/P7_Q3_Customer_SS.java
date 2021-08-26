//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 25th  Aug, 2021
//PRAC-07: SNYCHRONIZATION

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class P7_Q3_Customer_SS implements Runnable
{
  private AtomicInteger spaces;
  private Semaphore bavailable;
  private Semaphore cavailable;
  private Random ran = new Random();
public P7_Q3_Customer_SS (AtomicInteger spaces, Semaphore bavailable, Semaphore cavailable){
  this.spaces = spaces;
  this.bavailable = bavailable;
  this.cavailable = cavailable;
 }
  @Override
  public void run(){
  try{
   cavailable.release();
   if(bavailable.hasQueuedThreads()){
    spaces.decrementAndGet();
    System.out.println("Custpmer in waiting area");
    bavailable.acquire();
    spaces.incrementAndGet();
  }
  else
  {
    bavailable.acquire();
  }
  }catch(InterruptedException e){}
 }//run() ends
}//P7_Q3_Customer_SS class