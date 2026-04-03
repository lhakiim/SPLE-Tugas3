package aisco.product.sarnas;

import aisco.volunteer.VolunteerFactory;
import aisco.volunteer.core.Volunteer;
import aisco.volunteer.core.VolunteerComponent;

public class AplikasiSAR {
    public static void main(String[] args) {
        System.out.println("=== PRODUK 4: Sistem Relawan Tim SAR (Core + Bencana) ===\n");
        
        VolunteerComponent base = (VolunteerComponent) VolunteerFactory.createVolunteer(
            "aisco.volunteer.core.VolunteerImpl",
            "SAR-999", "Kapten Joko", "joko@sar.go.id", "0899999999"
        );

        Volunteer sarVolunteer = VolunteerFactory.createVolunteer(
            "aisco.volunteer.bencana.VolunteerImpl",
            base, "Gunung Merapi, Jawa Tengah", "Erupsi Vulkanik", "2026-04-04", true
        );

        sarVolunteer.printHeader();
        System.out.println(sarVolunteer.getVolunteer());
        System.out.println();
        sarVolunteer.dispatch();
    }
}