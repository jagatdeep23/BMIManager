/**
 * Created by jc277043 on 16/03/15.
 */
public class Patient {
    private String name;
    private int age;
    private double height, width;

   public void setName(String name){
        this.name =name;
    }
    public void getName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age =age;
    }
    public void getAge(String name){
        this.age =age;
    }
    public void getBMI(double bmi){
        this.bmi =setDetail();

    public double setDetail(double height,double width)
    {
       return this.width/(this.height*this.height);
    }


}
