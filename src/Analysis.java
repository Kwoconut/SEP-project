
public class Analysis
{
   private String type;
   private String matrix;
   private MyDate date;
   private int numberOfEmployees;
   private boolean assigned;
   private Employee[] employees;

   public Analysis(String type, String matrix, int MaxNumberOfEmployees, MyDate date)
   {
      this.type = type;
      this.matrix = matrix;
      this.date = date;
      this.employees = new Employee[MaxNumberOfEmployees];
   }

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public String getMatrix()
   {
      return matrix;
   }

   public void setMatrix(String matrix)
   {
      this.matrix = matrix;
   }

   public MyDate getDate()
   {
      return date.copy();
   }

   public void setDate(MyDate date)
   {
      this.date = date.copy();
   }

   public int getNumberOfEmployees()
   {
      return numberOfEmployees;
   }

   public void setNumberOfEmployees(int NumberOfEmployees)
   {
      this.numberOfEmployees = NumberOfEmployees;
   }

   public boolean getAssigned()
   {
      return assigned;
   }

   public void setAssigned(boolean assigned)
   {
      this.assigned = assigned;
   }

   public int getMaxNumberOfEmployees()
   {
      return employees.length;
   }

   public boolean isAssigned()
   {
      if (assigned == false)
      {
         return false;
      }

      else
      {
         return true;
      }
   }

   public void assignEmployee(Employee employee)
   {
      if (isAssigned() == true)
      {
         return;
      }
      else
      {
         employees[numberOfEmployees] = employee;
         numberOfEmployees++;
         if (numberOfEmployees == employees.length)
         {
            assigned = true;
         }
      }
   }

   public String toString()
   {
      String s = "";
      s += "\n" + type + "\n";
      s += matrix + "\n";
      s += date + "\n\n";
      s += numberOfEmployees + "\n";
      s += assigned + "\n\n\n";
      for (int i = 0; i < employees.length; i++)
      {
         if (employees[i] != null)
         {
            s += employees[i].getName() + "\n";
         }
         else
         {
            s += employees[i] + "\n";
         }
      }
      return s;
   }
}
