//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 14TH Aug 2021
//PRAC-05: THREADS


class P5_Q1_Summation_SS implements Runnable
{
   int upperLimit,sum;
   public P5_Q1_Summation_SS(int upperLimit)
   {
      this.upperLimit=upperLimit;
    }
     public void run()
    {
        for (int i=1; i<=upperLimit; i++)
          sum+=i;
     }
}//end of class P5_Q1_Summation_SS

public class P5_Q1_SummationTest_SS
{ 
   public static void main(String args[])
   {
       if(args.length <=0)
          System.out.println("Usage:   P5_Q1_SummationTest_SS <integervalue>");
       else
        {
           int upp= Integer.parseInt(args[0]);
           if(upp <=0)
              System.out.println("args[0]: " +args[0]+ " must be a positive number");
       else
       {
             P5_Q1_Summation_SS s=new P5_Q1_Summation_SS(upp);
             Thread t= new Thread(s);
              t.start();
              try{
                          t.join();
                          System.out.println("The sum of first  "+ upp +"  elements is "+(s.sum));
              }
               catch(Exception e){
                      e.printStackTrace();
              }
            }//inner else ends
       }//outer else ends
    }//main ends
}//end of the class class P5_Q1_SummationTest_SS