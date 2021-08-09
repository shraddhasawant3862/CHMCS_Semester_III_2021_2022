//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

import java.rmi.*;
import java.rmi.server.*;
public class P4_RMI_CalcServerImpl_SS extends UnicastRemoteObject implements P4_RMI_CalcServerIntf_SS
{
   public P4_RMI_CalcServerImpl_SS() throws RemoteException{
   }
    public int add(int a, int b) throws RemoteException
   {
      return a+b;
    }
    public int subtract(int a,int b) throws RemoteException
   {
       return a-b;
    }
     public int multiply(int a,int b) throws RemoteException
    {
       return a*b;
     }
       public int divide(int a,int b) throws RemoteException
     {
        return a/b;
      }
}//class ends