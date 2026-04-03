package aisco.product.volunteerbencana;

import aisco.volunteer.VolunteerFactory;
import aisco.volunteer.core.Volunteer;
import aisco.volunteer.core.VolunteerComponent;

public class VolunteerBencana {
    public static void main(String[] args) {
        System.out.println("=== PRODUK 2: Bencana Volunteer (dengan fitur bencana) ===\n");

        VolunteerComponent base = (VolunteerComponent) VolunteerFactory.createVolunteer(
            "aisco.volunteer.core.VolunteerImpl",
            "V002", "Siti Rahayu", "siti@email.com", "08198765432"
        );

        Volunteer bencanaVolunteer = VolunteerFactory.createVolunteer(
            "aisco.volunteer.bencana.VolunteerImpl",
            base, "Cianjur, Jawa Barat", "Gempa Bumi", "2025-04-03", true
        );

        bencanaVolunteer.printHeader();
        System.out.println(bencanaVolunteer.getVolunteer());
        System.out.println();
        bencanaVolunteer.dispatch();
    }
}