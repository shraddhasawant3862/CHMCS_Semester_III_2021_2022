//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

public interface P4_PC_MP_Channel_SS<E>
{
   //send a message to the channel
   public void send(E item);
 
   //Receive a message from the channel
   public E receive();
}//interface ends