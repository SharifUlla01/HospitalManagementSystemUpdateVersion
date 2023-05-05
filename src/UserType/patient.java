
package UserType;

public class patient extends person {
    
    
    private final String illness;
    private final String prescription;

    public patient(String name, int age, String gender,String userid, String email, int phone, String illness, String prescription) {
        super(name, age, gender, userid, email,phone);
        this.illness = illness;
        this.prescription = prescription;
    }

   
    

    public String getIllness() {
        return illness;
    }

    public String getPrescription() {
        return prescription;
    }

     @Override
    public String toString() {
        return "Patient " + getName() + ", " + getAge() + " years old, " + getGender() + ", " + ",User ID: " + getUserid() +"Email: "+ getEmail()+ " Phone: "+ getPhone()+ " " + illness + " illness, Prescription: " + prescription;
    }

	
}
