package aisco.volunteer;

import aisco.volunteer.core.Volunteer;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class VolunteerFactory {
    private static final Logger LOGGER = Logger.getLogger(VolunteerFactory.class.getName());

    public VolunteerFactory() {
    }

    public static Volunteer createVolunteer(String fullyQualifiedName, Object ... base) {
        Volunteer record = null;
        try {
            Class<?> clz = Class.forName(fullyQualifiedName);
            
            // --- BAGIAN YANG DIPERBAIKI ---
            // Ambil semua constructor yang ada
            Constructor<?>[] constructors = clz.getDeclaredConstructors();
            Constructor<?> targetConstructor = null;
            
            // Loop untuk mencari constructor yang jumlah parameternya sama persis dengan jumlah argumen 'base'
            for (Constructor<?> c : constructors) {
                if (c.getParameterCount() == base.length) {
                    targetConstructor = c;
                    break;
                }
            }

            // Jika tidak ketemu, lemparkan error yang jelas
            if (targetConstructor == null) {
                LOGGER.severe("Tidak ada constructor di " + fullyQualifiedName + " yang menerima " + base.length + " argumen.");
                throw new IllegalArgumentException("Constructor mismatch");
            }

            // Gunakan constructor yang tepat
            record = (Volunteer) targetConstructor.newInstance(base);
            // ------------------------------
            
        } 
        catch (IllegalArgumentException e) {
            LOGGER.severe("Failed to create instance of Volunteer.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            LOGGER.severe("Failed to run: Check your constructor argument");
            System.exit(20);
        }
        catch (ClassCastException e) {   
            LOGGER.severe("Failed to create instance of Volunteer.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            LOGGER.severe("Failed to cast the object");
            System.exit(30);
        }
        catch (ClassNotFoundException e) {
            LOGGER.severe("Failed to create instance of Volunteer.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            LOGGER.severe("Decorator can't be applied to the object");
            System.exit(40);
        }
        catch (Exception e) {
            LOGGER.severe("Failed to create instance of Volunteer.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            System.exit(50);
        }
        return record;
    }
}