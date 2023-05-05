
package Homepage;


import UserType.doctor;
import UserType.patient;
import java.util.ArrayList;
import java.util.Scanner;



public class home {
    private final String hname;
    private final String address;
    private final ArrayList<doctor> doctors;
    private final ArrayList<patient> patients;

    public home(String hname, String address) {
        this.hname = hname;
        this.address = address;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

   
    

    public String getName() {
        return hname;
    }

    public String getAddress() {
        return address;
    
}

    public void addPatient(Scanner scanner) {
        System.out.println("\nAdding a new Patient:");
        System.out.print("Enter Patient Name: ");
        String name = scanner.next();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Patient Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Patient User Id: ");
        String userid = scanner.next();
        System.out.print("Enter Patient Email: ");
        String email = scanner.next();
        System.out.print("Enter Patient phone: ");
        int phone = scanner.nextInt();
        System.out.print("Enter Patient Illness: ");
        String illness = scanner.next();
        System.out.print("Enter Patient Prescription: ");
        String prescription = scanner.next();

        patient patient = new patient(name, age, gender,userid,email,phone, illness, prescription);
        patients.add(patient);
        System.out.println("\nNew Patient added successfully!");
    }

    public void addDoctor(Scanner scanner) {
       
        System.out.println("\nAdding a new Doctor:");
        System.out.print("Enter Doctor Name: ");
        String name = scanner.next();
        System.out.print("Enter Doctor Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Doctor Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Doctor User Id: ");
        String userid = scanner.next();
        System.out.print("Enter Doctor Email: ");
        String email = scanner.next();
        System.out.print("Enter Doctor phone: ");
        int phone = scanner.nextInt();
        
        System.out.print("Enter Doctor Specialization: ");
        String specialization = scanner.next();
        System.out.print("Enter Doctor License Number: ");
        String licenseNumber = scanner.next();
        doctor doctor = new doctor(name, age, gender,userid,email,phone, specialization, licenseNumber);
        doctors.add(doctor);
        System.out.println("\nNew Doctor added successfully!");
    }

    public void viewDoctors() {
        System.out.println("\nList of Doctors in " + hname + " Hospital:");
    if (doctors.isEmpty()) {
        System.out.println("No Doctors available.");
    } else {
        doctors.forEach((doctor) -> {
            System.out.println(doctor.toString());
            });
    }
        
    }

    public void viewPatients() {
        
        System.out.println("\nList of Patients in " + hname + " Hospital:");
    if (patients.isEmpty()) {
        System.out.println("No Patients available.");
    } else {
        patients.forEach((patient) -> {
            System.out.println(patient.toString());
            });
    }
        
    }
}