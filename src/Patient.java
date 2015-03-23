/**
 * Created by jc277043 on 16/03/15.
 */
public class Patient {
    private String name;
    private int age;
    private double height, width;
    public  Patient(String name,int age,double height, double weight)
    {
        this.name= name;
        this.age = age;
        this.height= height;
        this.width = width;
    }


    public String getName(){
        return this.name;
    }

     public int getAge() {

        return this.age;
    }
    public double getBMI() {
        return this.width / (this.height * this.height);
    }


    public void add(Patient patient) {

    }
}
