
public class EmployeeTest
{
   public static void main(String[] args)
   {
   Name name = new Name("Valeriu","Marandici");
   TrainingList list = new TrainingList();
   
   list.addTraining(new Training("Fat"));
   list.addTraining(new Training("Cereale"));
   list.addTraining(new Training("Glucoze"));
   
   Employee employee = new Employee(name,"VM",list);
   employee.train("Fat");
   employee.train("Cereale");
   employee.train("Glucoze");
   employee.setStatusVacation();
   employee.setToFired();
   employee.getName().setLastName("Romanciuc");
   System.out.println(employee.toString());
   employee.setToHired();
   System.out.println("Fired?" + employee.getState());
   }
}
