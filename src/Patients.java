/**
 * Created by jc277043 on 23/03/15.
 */
public class Patients {
    Patient[] records;
    int current;
    public Patients(int MaxSize){
        records= new Patient[MaxSize];

    }




    public int count(){
        return current;
    }
    public  void add(Patient patient){
        records[current++]=patient;

    }

    public Patient get(int i) {
        return records[i];
    }
    public  boolean isFull()
    {
        return (current==records.length);
    }
    public  boolean isEmpty()
    {
        return (current==0);
    }
}
