package oop_lab9;

public class job {
    private String position;
    private Double Salary;

    @Override
    public String toString() {
        return "job{" +
                "position='" + position + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public job(String position, Double salary) {
        this.position = position;
        Salary = salary;
    }
}
