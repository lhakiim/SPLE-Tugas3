package aisco.product.palangmerah;

import aisco.volunteer.VolunteerFactory;
import aisco.volunteer.core.Volunteer;
import aisco.volunteer.core.VolunteerComponent;

public class AplikasiPalangMerah {
    public static void main(String[] args) {
        System.out.println("=== PRODUK 3: Sistem Relawan Palang Merah (Core) ===\n");
        Volunteer volunteer = VolunteerFactory.createVolunteer(
            "aisco.volunteer.core.VolunteerImpl",
            "PMI-001", "Andi Dermawan", "andi@pmi.org", "0811111111"
        );
        volunteer.printHeader();
        System.out.println(volunteer.getVolunteer());
        volunteer.addVolunteer(volunteer);
        volunteer.dispatch();
    }
}