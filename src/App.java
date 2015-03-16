/**
 * Created by jc277043 on 16/03/15.
 */
import java.util.Scanner;
public class App {
   running: while (true)

    public static void main(String[] args) {
        System.out.println("BMI Manager");
        System.out.println("Please select from the following menu options: \n \t1.Add new patient\n \t2.View patient \n \t3. Exit\n");
        System.out.println("Enter choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

Patient patient= new Patient();
        switch (choice) {
            case 1:

            {
              addPatient(patient,scanner );
                break;
            }

            case 2:

            {

                viewpatient(patient);
                break;
            }
            case 3:

            {
                System.out.println("Good Bye{{{");
                break running;
            }
        }
        private static void viewpatient(Patient patient){
            String message= String.format(,patient.getAge(),patient.getName(),patient.BMI;)
            System.out.println(message);
        }




private static void addPatient(Patient patient, Scanner scanner){
        System.out.println("Enter patient age ");
        int age = scanner.nextInt();
        patient.setAge(age);
        System.out.println("Enter patient name ");
        String name = scanner.toString();
        patient.setName(name);
        System.out.println("Enter patient height ");
        double height= scanner.nextDouble();
        System.out.println("Enter patient Weight ");
        double width= scanner.nextDouble();
        patient.setDetail(height,width)
}
        }