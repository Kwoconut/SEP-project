
public class EmployeeListTest
{
   public static void main(String[] args)
   {
   Name name = new Name("Valeriu","Marandici");
   Name name2 = new Name("Valeriu","Romanciuc");

   
   TrainingList list = new TrainingList();
   
   list.addTraining(new Training("Fat"));
   list.addTraining(new Training("Cereale"));
   list.addTraining(new Training("Glucoze"));
   
   Employee employee = new Employee(name,"VM",list);
   Employee employee2 = new Employee(name2,"VMS",list);
   
   EmployeeList empList = new EmployeeList();
   
   empList.addEmployee(employee2);
   empList.addEmployee(employee);
   
   empList.getEmployee(0).train("Fat");
   empList.getEmployee(0).train("Cereale");
   empList.getEmployee(0).train("Glucoze");
   
   empList.setStatusTraining(0);
   
   System.out.println(empList);
   }
   
}
