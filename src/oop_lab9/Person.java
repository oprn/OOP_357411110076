package oop_lab9;


public class Person {
    private String personID;
    private String name;
    private address address;
    private job job;

    public Person(String personID, String name, oop_lab9.address address, oop_lab9.job job) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public oop_lab9.address getAddress() {
        return address;
    }

    public void setAddress(oop_lab9.address address) {
        this.address = address;
    }

    public oop_lab9.job getJob() {
        return job;
    }

    public void setJob(oop_lab9.job job) {
        this.job = job;
    }
}//class
