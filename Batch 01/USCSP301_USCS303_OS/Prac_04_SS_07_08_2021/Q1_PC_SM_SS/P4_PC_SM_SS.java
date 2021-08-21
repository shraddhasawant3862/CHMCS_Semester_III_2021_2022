//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

public class P4_PC_SM_SS
{
  public static void main(String[]args){
    P4_PC_SM_BufferImpl_SS          bufobj      =     new P4_PC_SM_BufferImpl_SS();
    System.out.println("\n==========PRODUCER producing the ITEMS==========\n");
    bufobj.insert("Name:Shraddha Sawant");
    bufobj.insert("CHMCS:Batch-B1");
    bufobj.insert("PRN:2020016400773862");
    bufobj.insert("USCSP301-USCS303:OS Practical-P4");
   System.out.println("\n==========CONSUMER consuming the ITEMS==========\n");
   String element=bufobj.remove();
   System.out.println(element);
   System.out.println(bufobj.remove());
   System.out.println(bufobj.remove());
   System.out.println(bufobj.remove());
}//main ends
}//class ends
   
