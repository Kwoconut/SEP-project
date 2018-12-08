import model.Employee;
import model.Name;
import model.WorkPlanningToolModelManager;

public class FinalBinaryTesting
{
    public static void main(String[] args)
    {
       WorkPlanningToolModelManager tool = new WorkPlanningToolModelManager();
       
       Employee emp = new Employee(new Name("Angel","Somicu"),"AS339");
       Employee emp2 = new Employee(new Name("Valeriu","Marandici"),"VM945");
       Employee emp3 = new Employee(new Name("Gicu","Small-Dicku"),"SM000");
       Employee emp4 = new Employee(new Name("Andrei","Abalasei"),"AA345");
       
       tool.addEmployee(emp);
       tool.addEmployee(emp2);
       tool.addEmployee(emp3);
       tool.addEmployee(emp4);
       
       tool.updateEmployeeListFile();
       tool.readEmployeeListFile();
       System.out.println(tool.getEmployeeList());
       
       System.out.println("-------------");
       System.out.println("-------------");
       System.out.println("-------------");
       
       Employee emp5 = new Employee(new Name("Fabian","Bernhardt"),"BH775");
       Employee emp6 = new Employee(new Name("Simona","Timurus"),"TM333");
       Employee emp7 = new Employee(new Name("Mihai","Galea"),"MG645");
       Employee emp8 = new Employee(new Name("Michael","Viuff"),"MV567");
       
       tool.removeEmployee(0);
       tool.removeEmployee(0);
       tool.removeEmployee(0);
       tool.removeEmployee(0);
       tool.addEmployee(emp5);
       tool.addEmployee(emp6);
       tool.addEmployee(emp7);
       tool.addEmployee(emp8);
       
       tool.updateEmployeeListFile();
       tool.readEmployeeListFile();
       System.out.println(tool.getEmployeeList());
    }
}
