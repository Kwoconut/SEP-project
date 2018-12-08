package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable
{
   private TrainingList training;
   private Name name;
   private String ID;
   private boolean state;
   private String status;
   public static String status_available = "Available";
   public static String status_unavailable = "Unavailable";
   public static String status_vacation = "Vacation";
   public static String status_vacationPending = "Vacation Pending";
   public static String status_ontraining = "Training";

   public Employee(Name name, String ID)
   {
      this.name = name;
      this.ID = ID;
      training = readTrainingTypes();
      status = status_available;
   }

   public TrainingList readTrainingTypes()
   {
      TrainingList list = new TrainingList();
      String filename = "analysisTypes.txt";
      try
      {
         File file = new File(filename);
         Scanner in = new Scanner(file);
         while (in.hasNext())
         {
            String line = in.nextLine();
            list.addTraining(new Training(line));
         }
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      return list;
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
      setStatusTraining();
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

   public void setStatusVacationPending()
   {
      status = status_vacationPending;
   }

   public String getStatus()
   {
      return status;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Employee))
      {
         return false;
      }
      Employee other = (Employee) obj;
      return name.equals(other.getName()) && ID.equals(other.getID());
   }

   public String toString()
   {
      String s = "";
      s += name + "\n";
      s += ID + "\n";
      s += status + "\n\n";
      s += "Trainings:\n" + training.toString() + "\n";
      s += "Fired?" + " " + state +"\n";

      return s;
   }
}
