import java.util.ArrayList;

/**
 * Created by jc277043 on 23/03/15.
 */
public class Patients {
    ArrayList<Patient> records;
    int current;
    public Patients(){
        records= new ArrayList<Patient>();

    }




    public int count(){
        return records.size();
    }
    public  void add(Patient patient){
        records.add(patient);

    }

    public Patient get(int i) {
        return records.get(i);
    }
    //public  boolean isFull()
    {
      //  return (current==records.length);
    }
    public  boolean isEmpty()
    {
        return records.isEmpty();
    }
}
