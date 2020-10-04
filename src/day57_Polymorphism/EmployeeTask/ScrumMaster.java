package day57_Polymorphism.EmployeeTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "Scrum master[" +
                "name='" + name +
                ", id=" + id +
                ", jobTitle='" + jobTitle +
                ", salary=" + salary +
                ", gender=" + gender +
                ']';
    }
}
