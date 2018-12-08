import model.Employee;
import model.Name;
import model.TrainingList;

public class EmployeeTest
{
   public static void main(String[] args)
   {
   Name name = new Name("Valeriu","Marandici");
   TrainingList list = new TrainingList();

   
   Employee employee = new Employee(name,"VM");
   employee.train("Fat");
   employee.train("Cereale");
   employee.train("Glucoze");
   employee.setStatusVacation();
   employee.setToFired();
   employee.getName().setLastName("Romanciuc");
   System.out.println(employee.toString());
   employee.setToHired();
   System.out.println("Fired?" + employee.getState());
   System.out.println("hi");
   }
}
