import model.Employee;
import model.MyDate;
import model.Name;
import model.Vacation;

public class VacationTest
{
   public static void main(String[] args)
   {
      Name name = new Name("Valeriu","Marandici");
      Name name2 = new Name("Valeriu","Romanciuc");

      
      Employee employee = new Employee(name,"VM");
      
      Vacation vacation = new Vacation(employee,"Tata lor haha vreau vacanta",new MyDate(28,7,1999),new MyDate(28,7,2000));
      
      
      System.out.println(vacation);
      
      vacation.setReason("Muie mica laba trista vreau vacanta");
      
      System.out.println();
      System.out.println(vacation);
      
   }
}
