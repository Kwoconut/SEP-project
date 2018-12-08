import model.Employee;
import model.EmployeeList;
import model.Name;

public class EmployeeListTest
{
   public static void main(String[] args)
   {
   Name name = new Name("Valeriu","Marandici");
   Name name2 = new Name("Valeriu","Romanciuc");

   

   
   Employee employee = new Employee(name,"VM");
   Employee employee2 = new Employee(name2,"VMS");
   
   EmployeeList empList = new EmployeeList();
   
   empList.addEmployee(employee2);
   empList.addEmployee(employee);
   
   empList.getEmployee(employee).train("Fat");
   empList.getEmployee(employee).train("Cereale");
   empList.getEmployee(employee).train("Glucoze");
   
   empList.setStatusTraining(0);
   
   System.out.println(empList);
   }
   
}
