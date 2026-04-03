package aisco.volunteer.core;

public interface Volunteer {

    String getVolunteer();
    void addVolunteer(Object volunteer);
    void printHeader();
    void dispatch();
}
