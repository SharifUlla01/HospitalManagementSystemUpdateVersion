
package UserType;


public class person {

   private String name;
   private int age;
   private String gender;
   private String userid;
   private String email;
   private int phone;
    

    public person(String name, int age, String gender, String userid, String email, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.userid=userid;
        this.email=email;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
     public String getUserid() {
        return userid;
    }
     
      public String getEmail() {
        return email;
    }
      
       public int getPhone() {
        return phone;
    }
    
    
}
