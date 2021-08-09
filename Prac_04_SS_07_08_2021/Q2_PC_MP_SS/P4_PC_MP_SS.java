//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

import java.util.Date;
public class P4_PC_MP_SS
{
   public static void main(String args[])
   {
       //Producer and consumer process
       P4_PC_MP_Channel_SS<Date> mailBox=new P4_PC_MP_MessageQueue_SS<Date>();
       int i=0;
   do
   {
     Date message=new Date();
     System.out.println("Producer produced- "+(i+1)+ " : " +message);
     mailBox.send(message);
     Date rightNow=mailBox.receive();
     if(rightNow!=null)
     {
         System.out.println("Consumer consumed - " +(i+1) + " : " + rightNow);
      }
        i++;
  }while(i<10);
 }//main ends
}//class ends