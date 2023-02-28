/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital11;

/**
 *
 * @author NIKHIL
 */
public class User {
    private int date;
    private int id;
    private String patientname;
    private String dr;
   private int contactno;
     private int age;
    private String patientgender;
     private String bloodgroup;
    private String disease;
    private String address;
    public User(int date,int id,String patientname,String dr,int contactno,int age,String patientgender,String bloodgroup,String disease,String address)
    {
        this.date=date;
        this.id=id;
        this.patientname = patientname;
        this.dr = dr;
        this.contactno=contactno;
        this.age = age;
        this.patientgender=patientgender;
        this.bloodgroup=bloodgroup;
        this.disease = disease;
        this.address = address;
    }
    
     public int getdate()
    {
        return date;
    }
     public int getid()
    {
        return id;
    }
    public String getpatientname()
    {
        return patientname;
    }
    
    public String getdr()
    {
        return dr;
    }
     public int getcontactno()
    {
        return contactno;
    }
    
   
    public int getage()
    {
        return age;
    }
     public String getpatientgender()
    {
        return patientgender;
    }
      public String getbloodgroup()
    {
        return bloodgroup;
    }
    
   
    public String getdisease()
    {
        return disease;
    }
    public String getaddress()
    {
        return address;
    }
}

    


    

