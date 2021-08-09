//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

import java.rmi.*;
public interface P4_RMI_CalcServerIntf_SS extends Remote
{
   int add(int a,int b) throws RemoteException;
   int subtract(int a,int b) throws RemoteException;
   int multiply(int a,int b) throws RemoteException;
   int divide(int a,int b) throws RemoteException;
}//interface ends