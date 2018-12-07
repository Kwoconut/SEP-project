import java.util.ArrayList;

public class VacationList
{
   private ArrayList<Vacation> list;
   Vacation pendingVacation;

   public VacationList()
   {
      list = new ArrayList<Vacation>();
   }
   public void requestVacaction(Vacation vacation)
   {
      list.add(vacation);
   }
   public void approveVacation(int index)//tre de schimbat class diagramu aici
   {
      list.get(index).setToChecked();
   }
   public void declineVacation(int index)
   {
      list.remove(index);
   }
   public boolean isChecked(int index) 
   {
      return list.get(index).isChecked();
   }
   public void setReason(String reason,int index) 
   {
      list.get(index).setReason(reason);
   }
   public String getReason(int index) 
   {
      return list.get(index).getReason();
   }
   public String toString()
   {
      String s = "";
      for (Vacation element : list)
      {
         s += "\n";
         s += element.toString();
      }
      return s;
   }
}
