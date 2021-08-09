//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION
 
import java.net.*;
import java.rmi.*;
public class P4_RMI_CalcServer_SS
{
  public static void main(String args[])
   {
      try
      {
     P4_RMI_CalcServerImpl_SS csi=new P4_RMI_CalcServerImpl_SS();
      Naming.rebind("CSB1",csi);
   }//try ends
    catch(Exception e) {
System.out.println("Exception: " + e);
    }//catch ends
  }//main ends
}//class ends