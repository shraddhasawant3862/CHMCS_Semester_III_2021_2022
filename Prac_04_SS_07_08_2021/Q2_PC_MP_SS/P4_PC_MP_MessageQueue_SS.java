//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

import java.util.Vector;
public class P4_PC_MP_MessageQueue_SS<E> implements P4_PC_MP_Channel_SS<E>
{
   private Vector<E> queue;
   public P4_PC_MP_MessageQueue_SS(){
     queue=new Vector<E>();
   }
  //This implements a nonblocking send
  public void send(E item){
        queue.addElement(item);
 }//send() ends
  //This implements a nonblocking receive
  public E receive(){
     if(queue.size()==0)
           return null;
     else
             return queue.remove(0);
 }//receive()ends
}//class ends