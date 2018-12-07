
public class Employee
{
   private TrainingList training;
   private Name name;
   private String ID;
   private boolean state;
   private String status;
   public static String status_available = "Available";
   public static String status_unavailable = "Unavailable";
   public static String status_vacation = "Vacation";
   public static String status_ontraining = "Training";

   public Employee(Name name, String ID, TrainingList training)
   {
      this.name = name;
      this.ID = ID;
      this.training = training;
      status = status_available;
   }

   public Name getName()
   {
      return name;
   }

   public String getID()
   {
      return ID;
   }

   public boolean getState()
   {
      return state;
   }

   public void train(String type)
   {
      training.getTraining(type).train();
   }

   public TrainingList getTrainingList()
   {
      return training;
   }

   public void setToFired()
   {
      state = true;
   }

   public void setToHired()
   {
      state = false;
   }

   public void setStatusAvailable()
   {
      status = status_available;
   }

   public void setStatusUnavailable()
   {
      status = status_unavailable;
   }

   public void setStatusVacation()
   {
      status = status_vacation;
   }

   public void setStatusTraining()
   {
      status = status_ontraining;
   }

   public String getStatus()
   {
      return status;
   }

   public String toString()
   {
      String s = "";
      s += name + "\n";
      s += ID + "\n";
      s += status + "\n\n";
      s += "Trainings:\n" + training.toString() + "\n" ;
      s += "Fired?" + " " +state;

      return s;
   }
}
