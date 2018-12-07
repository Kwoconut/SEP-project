import java.util.ArrayList;

public class TrainingList
{
     private ArrayList<Training> trainings;
     
     public TrainingList()
     {
        trainings = new ArrayList<Training>();
     }
     
     public void addTraining(Training training)
     {
        trainings.add(training);
     }
     
     public void removeTraining(int index)
     {
        trainings.remove(index);
     }
     
     public Training getTraining(String type)
     {
       for (Training element : trainings)
       {
          if (element.getType().equals(type))
             return element;
       }
       return null;
     }
     
     public String toString()
     {
        String s = "";
        
        for (Training element : trainings)
        {
          s+= element.toString() + "\n";
        }
        
        return s;
     }
}
