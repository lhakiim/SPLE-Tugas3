package aisco.volunteer.core;

public class VolunteerImpl extends VolunteerComponent {

    public VolunteerImpl() {
        super();
    }

    public VolunteerImpl(String idVolunteer, String name, String email, String phone) {
        super(idVolunteer, name, email, phone);
    }

    @Override
    public String getVolunteer() {
        return "ID Volunteer: " + idVolunteer + "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone;
    }

    @Override
    public void addVolunteer(Object volunteer) {
        System.out.println("Volunteer added successfully!");
    }

    @Override
    public void printHeader() {
        System.out.println("=== Volunteer Information ===");
    }

    @Override
    public void dispatch() {
        System.out.println("Volunter ditugaskan untuk melakukan tugas!");
    }

    
}
