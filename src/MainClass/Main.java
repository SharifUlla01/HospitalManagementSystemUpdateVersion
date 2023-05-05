package MainClass;


import Homepage.home;
import java.util.Scanner;



public class Main {

  
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             home hospital = new home("Square Hospitals Ltd ", "Mirpur- 11, Bus Stand, Dhaka- 1216.");
             int choice = -1;
             
             while (choice != 0) {
                 System.out.println("*************************************************************");
                 System.out.println("Welcome to " + hospital.getName() + " Hospital Management System!");
                 System.out.println("1. Add a new Doctor");
                 System.out.println("2. Add a new Patient");
                 System.out.println("3. View all Doctors");
                 System.out.println("4. View all Patients");
                 System.out.println("0. Exit");
                 System.out.print("Enter your choice: ");
                 choice = scanner.nextInt();
                 
                 switch (choice) {
                     case 1:
                         hospital.addDoctor(scanner);
                         break;
                     case 2:
                         hospital.addPatient(scanner);
                         break;
                     case 3:
                         hospital.viewDoctors();
                         break;
                     case 4:
                         hospital.viewPatients();
                         break;
                     case 0:
                         System.out.println("\nExiting Hospital Management System...");
                         break;
                     default:
                         System.out.println("\nInvalid choice!");
                         break;
                 }
             }}
    }
}



