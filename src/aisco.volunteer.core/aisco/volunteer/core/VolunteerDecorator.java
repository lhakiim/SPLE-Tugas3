package aisco.volunteer.core;

public abstract class VolunteerDecorator extends VolunteerComponent {
    
    protected VolunteerComponent record;

    public VolunteerDecorator(VolunteerComponent record) {
        this.record = record;
    }

    public String getIdVolunteer()      { return record.getIdVolunteer();}
    public String getName()             { return record.getName();}
    public String getEmail()            { return record.getEmail();}
    public String getPhone()            { return record.getPhone();}

    @Override
    public String getVolunteer() {  
        return record.getVolunteer();
    }

    @Override
    public void addVolunteer(Object volunteer) {
        record.addVolunteer(volunteer);
    }

    @Override
    public void printHeader() {
        record.printHeader();
    }

    @Override
    public void dispatch() {
        record.dispatch();
    }
    
}
