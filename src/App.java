/**
 * Created by jc277043 on 16/03/15.
 */
import java.util.Scanner;
public class App {


    public static void main(String[] args) {
        Patients patient = new Patients(2);
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

                    if (patient.isFull() == true)
                    {
                        System.out.println("database is full");
                    }
                    else {
                    patient.add(createPatient(scanner));

                }
                    break;
                }


                case 2:

                {
                    viewPatients(patient);
                    if ( patient.isEmpty()==true)
                    {
                        System.out.println("database is Empty");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Good Bye{{{");
                    break running;

                }
            }


        }
    }

    private static Patient createPatient( Scanner scanner) {

        System.out.println("Enter patient name ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Enter patient age ");
        int age = scanner.nextInt();

        System.out.println("Enter patient height ");
        double height = scanner.nextDouble();

        System.out.println("Enter patient Weight ");
        double width = scanner.nextDouble();
        return new Patient(name,age,height,width);

    }

    private static void viewPatients(Patients patients) {
        for(int i=0; i<patients.count();++i)
        {
            Patient patient= patients.get(i);
        String message = String.format("Patient name is %s \n" +
                " patient age is %d \n" +
                " patient BMI is %.2f", patient.getName(), patient.getAge(), patient.getBMI());
            System.out.println(message);

        }
    }
    }






