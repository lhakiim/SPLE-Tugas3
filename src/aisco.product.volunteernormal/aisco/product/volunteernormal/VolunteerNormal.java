package aisco.product.volunteernormal;
import aisco.volunteer.core.Volunteer;
import aisco.volunteer.VolunteerFactory;

public class VolunteerNormal {
    public static void main(String[] args) {
        System.out.println("=== PRODUK 1: Basic Volunteer (tanpa fitur bencana) ===\n");

        Volunteer volunteer = VolunteerFactory.createVolunteer(
            "aisco.volunteer.core.VolunteerImpl",
            "V001", "Budi Santoso", "budi@email.com", "08123456789"
        );
        volunteer.printHeader();
        System.out.println(volunteer.getVolunteer());
        volunteer.addVolunteer(volunteer);
        volunteer.dispatch();
    }
}
