import model.Analysis;
import model.AnalysisList;
import model.Employee;
import model.MyDate;
import model.Name;

public class Test
{
   public static void main(String[] args)
   {
   Name name = new Name("Valeriu","Marandici");
   Name name2 = new Name("Valeriu","Romanciuc");
   Analysis analysis = new Analysis ("Fat", "Feed", 2, MyDate.now());
   Analysis analysis2 = new Analysis ("Glucose", "Food", 3, MyDate.now());
   AnalysisList alist = new AnalysisList();

   
   Employee employee = new Employee(name,"VM");
   Employee employee2 = new Employee(name2,"VMS");
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
