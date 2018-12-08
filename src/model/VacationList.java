package model;
import java.io.Serializable;
import java.util.ArrayList;

public class VacationList implements Serializable
{
   private ArrayList<Vacation> list;

   public VacationList()
   {
      list = new ArrayList<Vacation>();
   }

   public void requestVacaction(Vacation vacation)
   {
      list.add(vacation);
   }

   public void approveVacation(int index)
   {
      list.get(index).setToChecked();
      list.get(index).getEmployee().setStatusVacation();
   }

   public void declineVacation(int index)
   {
      list.remove(index);
   }

   public boolean isChecked(int index)
   {
      return list.get(index).isChecked();
   }

   public void setReason(String reason, int index)
   {
      list.get(index).setReason(reason);
   }

   public String getReason(int index)
   {
      return list.get(index).getReason();
   }

   public Vacation getVacationByEmployee(Employee employee)
   {
      for (Vacation element : list)
      {
         if (element.getEmployee().equals(employee))
         {
            return element;
         }
      }
      return null;
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
