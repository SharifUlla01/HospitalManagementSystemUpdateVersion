
package UserType;


public class doctor extends person {
    
    private final String specialization;
    private final String licenseNumber;

    public doctor(String name, int age, String gender, String userid, String email, int phone, String specialization, String licenseNumber) {
        super(name, age, gender, userid, email,phone);
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Doctor " + getName() + ", " + getAge() + " years old, " + getGender() + ",User ID: " + getUserid() +","+ getEmail()+ " "+ getPhone()+ " "  + specialization + " specialist, License No: " + licenseNumber;
    }
    
}
