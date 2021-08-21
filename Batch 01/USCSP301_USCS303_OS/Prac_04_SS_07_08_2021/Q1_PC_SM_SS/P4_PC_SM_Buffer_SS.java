//NAME: SHRADDHA SAWANT
//BATCH: B1
//PRN: 2020016400773862
//DATE: 8TH Aug 2021
//PRAC-04: PROCESS COMMUNICATION

public interface P4_PC_SM_Buffer_SS
{
  //Producer call this method
   public void insert(String item);

  //Consumers call this method
  public String remove();
}//interface ends