package aisco.volunteer.bencana;

import aisco.volunteer.core.VolunteerComponent;
import aisco.volunteer.core.VolunteerDecorator;

public class VolunteerImpl extends VolunteerDecorator {

    private String location;
    private String typeOfDisaster;
    private String dispatchDate;
    private boolean isInsidental;
    
    public VolunteerImpl(VolunteerComponent record, String location, String typeOfDisaster, String dispatchDate, boolean isInsidental) {
        super(record);
        this.location = location;
        this.typeOfDisaster = typeOfDisaster;
        this.dispatchDate = dispatchDate;
        this.isInsidental = isInsidental;
    }


    public String getLocation()         { return location; }
    public String getTypeOfDisaster()   { return typeOfDisaster; }
    public String getDispatchDate()     { return dispatchDate; }
    public boolean isInsidental()       { return isInsidental; }
    
    @Override
    public String getVolunteer() {
        return record.getVolunteer()
            + "\nLocation: " + location
            + "\nType of Disaster: " + typeOfDisaster
            + "\nDispatch Date: " + dispatchDate
            + "\nIs Insidental: " + isInsidental;

    }

    @Override
    public void addVolunteer(Object volunteer) {
        record.addVolunteer(volunteer);
        System.out.println("Volunteer added for disaster response!");
    }

    @Override
    public void printHeader() {
        record.printHeader();
    }

    @Override
    public void dispatch() {
        record.dispatch();
        System.out.println("Volunteer dispatched to disaster location!");
        System.out.println("Location: " + location);
        System.out.println("Type of Disaster: " + typeOfDisaster);
        System.out.println("Dispatch Date: " + dispatchDate);
        System.out.println("Status: Insidental");
    }
    
}
