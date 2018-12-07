
public class VacationTest
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
      
      Vacation vacation = new Vacation(employee,"Tata lor haha vreau vacanta",false,new MyDate(28,7,1999),new MyDate(28,7,2000));
      
      
      System.out.println(vacation);
      
      vacation.setReason("Muie mica laba trista vreau vacanta");
      
      System.out.println();
      System.out.println(vacation);
   }
}
