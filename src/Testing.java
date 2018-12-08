import model.Analysis;
import model.AnalysisList;
import model.Employee;
import model.EmployeeList;
import model.MyDate;
import model.Name;
import model.Vacation;
import model.VacationList;
import model.WorkPlanningToolModelManager;

public class Testing
{
   public static void main(String[] args)
   {
      
      
      
      Name name = new Name("Valeriu","Marandici");
      Name name2 = new Name("Valeriu","Romanciuc");
      Name name3 = new Name("Angel","Somicu");

     
      Employee employee = new Employee(name,"VM");
      Employee employee2 = new Employee(name2,"VMS");
      Employee employee3 = new Employee(name3,"ALDRQ");
      
      Analysis analysis = new Analysis ("Fat", "Feed", 2, MyDate.now());
      Analysis analysis2 = new Analysis ("Glucose", "Food", 3, new MyDate(20,10,1999));
      
//    Vacation vacation1 = new Vacation(employee, "Reason of Vacation", new MyDate(19,10,1999), new MyDate(21,10,1999));
//    Vacation vacation2 = new Vacation(employee2, "Reason of Vacation2", MyDate.now(), new MyDate(12,10,2018));
      
      
      
      
      
      AnalysisList alist = new AnalysisList();
      EmployeeList elist = new EmployeeList();
      VacationList vacationList = new VacationList();
      WorkPlanningToolModelManager tool = new WorkPlanningToolModelManager();
      
      tool.addEmployee(employee);
      tool.addEmployee(employee2);
      tool.addEmployee(employee3);
      
      tool.addAnalysis(analysis2);
      
      tool.requestVacation(new Vacation(employee, "Reason of Vacation", new MyDate(19,10,1999), new MyDate(21,10,1999)));
      tool.requestVacation(new Vacation(employee2, "Reason of Vacation2", MyDate.now(), new MyDate(12,10,2018)));
      
      
      System.out.println(tool.getEmployee(employee));
      tool.assignEmployee(analysis2, employee);
      tool.assignEmployee(analysis2, employee3);
      tool.getEmployee(employee2).train("Fat");
      tool.assignEmployee(analysis2, employee2);
      
      System.out.println(tool.getAnalysis("Glucose"));
      
   }

}
