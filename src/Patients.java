import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jc277043 on 23/03/15.
 */
public class Patients {
    ArrayList<Patient> records;
    int current;

    public Patients() {
        records = new ArrayList<Patient>();

    }


    public int count() {
        return records.size();
    }

    public void add(Patient patient) {
        records.add(patient);

    }

    public Patient get(int i) {
        return records.get(i);
    }

    public boolean isEmpty() {
        return records.isEmpty();
    }

    public Patient getPatientWithName(String name) {
        for (Patient patient : records) {
            if (patient.getName().equals(name))
                return patient;
        }
return null;
    }

      public void removePatientWithName(String name) {
        for (int i=0;i<records.size();++i) {
            if (records.get(i).getName().equals(name))
                records.remove(i);
            --i;
        }

    }
}
