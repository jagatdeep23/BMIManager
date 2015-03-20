/**
 * Created by jc277043 on 16/03/15.
 */
import java.util.Scanner;
public class App {


    public static void main(String[] args) {
        Patient patient = new Patient();
        running:
        while (true) {
            System.out.println("BMI Manager");
            System.out.println("Please select from the following menu options: \n \t1.Add new patient\n \t2.View patient \n \t3. Exit\n");
            System.out.println("Enter choice:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();



            switch (choice) {
                case 1:


                {

                    addPatient(patient, scanner);
                    break;
                }


                case 2:

                {
                    viewPatient(patient);

                    break;
                }
                case 3: {
                    System.out.println("Good Bye{{{");
                    break running;

                }
            }


        }
    }

    private static void addPatient(Patient patient, Scanner scanner) {

        System.out.println("Enter patient name ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        patient.setName(name);
        System.out.println("Enter patient age ");
        int age = scanner.nextInt();
        patient.setAge(age);
        System.out.println("Enter patient height ");
        double height = scanner.nextDouble();
        System.out.println("Enter patient Weight ");
        double width = scanner.nextDouble();
        patient.setDetail(height, width);
    }

    private static void viewPatient(Patient patient) {
        String message = String.format("Patient name is %s \n" +
                " patient age is %d \n" +
                " patient BMI is %.2f", patient.getName(), patient.getAge(), patient.getBMI());
            System.out.println(message);

        }
    }






