import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList
{
   private ArrayList<Employee> list;

   public EmployeeList()
   {
      list = new ArrayList<Employee>();
   }

   public int size()
   {
      return list.size();
   }

   public void addEmployee (Employee employee)
   {
      list.add(employee);
   }

   public void removeEmployee(int index)
   {
      list.remove(index);
   }

   public Employee getEmployee(int index)
   {
      return list.get(index);
   }

   public Employee[] getHiredEmployees()
   {
      ArrayList<Employee> hiredEmployees = new ArrayList<Employee>();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getState() ==false )
         {
            hiredEmployees.add(list.get(i));
         }
      }
      return (Employee[]) hiredEmployees.toArray();
   }
   public Employee[] getFiredEmployees()
   {
      ArrayList<Employee> firedEmployees = new ArrayList<Employee>();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getState() ==true )
         {
            firedEmployees.add(list.get(i));
         }
      }
      return (Employee[]) firedEmployees.toArray();
   }
   
   public void setToHired(int index)
   {
      list.get(index).setToHired();
   }
   public void setToFired(int index)
   {
      list.get(index).setToFired();
   }
   public Name getName(int index)
   {
      return list.get(index).getName();
   }
   public String getID(int index)
   {
      return list.get(index).getID();
   }
   public boolean getState(int index)
   {
      return list.get(index).getState();
   }
   public void train(String type,int index)
   {
      list.get(index).train(type);
   }
   public TrainingList getTrainingList(int index)
   {
      return list.get(index).getTrainingList();
   }
   public void setStatusAvailable(int index)
   {
      list.get(index).setStatusAvailable();
   }

   public void setStatusUnavailable(int index)
   {
      list.get(index).setStatusUnavailable();
   }

   public void setStatusVacation(int index)
   {
      list.get(index).setStatusVacation();
   }

   public void setStatusTraining(int index)
   {
      list.get(index).setStatusTraining();
   }
   public String getStatus(int index)
   {
      return list.get(index).getStatus();
   }
}

