package aisco.volunteer.core;

public abstract class VolunteerComponent implements Volunteer {
    
    protected String idVolunteer;
    protected String name;
    protected String email;
    protected String phone;

    public VolunteerComponent(){

    }

    public VolunteerComponent(String idVolunteer, String name, String email, String phone) {
        this.idVolunteer = idVolunteer;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getIdVolunteer()      {return idVolunteer;}
    public String getName()             {return name;}
    public String getEmail()            {return email;}
    public String getPhone()            {return phone;}

    public void setIdVolunteer(String idVolunteer)    {this.idVolunteer = idVolunteer;}
    public void setName(String name)                  {this.name = name;}
    public void setEmail(String email)                {this.email = email;}
    public void setPhone(String phone)                {this.phone = phone;}

    public abstract String getVolunteer();
    public abstract void addVolunteer(Object volunteer);
    public abstract void printHeader();
    public abstract void dispatch();
    public String toString() {
        return "ID Volunteer: " + idVolunteer + "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone;
    }
}
