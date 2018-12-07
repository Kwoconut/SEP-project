
public class VacationListTest
{
   public static void main(String[] args)
   {
      Name name = new Name("Valeriu","Marandici");
      Name name2 = new Name("Valeriu","Romanciuc");

      
      TrainingList list = new TrainingList();
      
      list.addTraining(new Training("Fat"));
      list.addTraining(new Training("Cereale"));
      list.addTraining(new Training("Glucoze"));
      list.getTraining("Fat").train();
      
      Employee employee = new Employee(name,"VM",list);
      Employee employee2 = new Employee(name2,"VMS",list);
      MyDate startDate= new MyDate(13,1,1997);
      MyDate endDate= new MyDate(13,1,1998);
   Vacation vacation1= new Vacation(employee, "Reason of Vacation", false, startDate, endDate);
   Vacation vacation2= new Vacation(employee2, "Reason of Vacation2", false, startDate, endDate);
   VacationList vacationList = new VacationList();
   
   vacationList.requestVacaction(vacation1);
   vacationList.requestVacaction(vacation2);
   vacationList.approveVacation(0);

   
   System.out.println(vacationList);
   }
}
