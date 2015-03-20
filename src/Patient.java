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
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age =age;
    }
     public int getAge() {

        return this.age;
    }
    public double getBMI() {
        return this.width / (this.height * this.height);
    }

    public void setDetail(double height,double width)
    {
       this.height= height;
        this.width = width;
    }



}
