
public class Test
{
   public static void main(String[] args)
   {
   Name name = new Name("Valeriu","Marandici");
   Name name2 = new Name("Valeriu","Romanciuc");
   Analysis analysis = new Analysis ("Fat", "Feed", 2, MyDate.now());
   Analysis analysis2 = new Analysis ("Glucose", "Food", 3, MyDate.now());
   AnalysisList alist = new AnalysisList();
   TrainingList list = new TrainingList();
   
   list.addTraining(new Training("Fat"));
   list.addTraining(new Training("Cereale"));
   list.addTraining(new Training("Glucoze"));
   
   Employee employee = new Employee(name,"VM",list);
   Employee employee2 = new Employee(name2,"VMS",list);
   employee.train("Fat");
   employee.train("Cereale");
   employee.train("Glucoze");
   employee.setStatusVacation();
   employee.setToFired();
   employee.getName().setLastName("Abalasei");
   System.out.println(employee.toString());
   employee.setToHired();
   System.out.println("Fired?" + employee.getState());
   
   alist.addAnalysis(analysis);
   alist.addAnalysis(analysis2);
   analysis.assignEmployee(employee);
   analysis.assignEmployee(employee2);
  
   System.out.println(analysis);
   
   System.out.println(alist);
   
   alist.removeAnalysis(0);
   
   System.out.println(alist);
   }
}
