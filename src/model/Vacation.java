package model;
import java.io.Serializable;

public class Vacation implements Serializable
{
   private String reason;
   private boolean check;
   private MyDate startDate;
   private MyDate endDate;
   private Employee employee;

   public Vacation(Employee employee, String reason, MyDate startDate,
         MyDate endDate)
   {
      this.employee = employee;
      this.reason = reason;
      this.startDate = startDate.copy();
      this.endDate = endDate.copy();
      employee.setStatusVacationPending();
   }

   public void setToChecked()
   {
      check = true;
   }

   public boolean isChecked()
   {
      return check;
   }

   public void setReason(String reason)
   {
      this.reason = reason;
   }

   public String getReason()
   {
      return reason;
   }

   public Employee getEmployee()
   {
      return employee;
   }

   public MyDate getStartDate()
   {
      return startDate;
   }

   public MyDate getEndDate()
   {
      return endDate;
   }

   public String toString()
   {
      String s = "";
      s += employee.getName() + "\n";
      s += reason + "\n";
      s += check + "\n";
      s += startDate + "\n";
      s += endDate + "\n";
      return s;
   }
}
