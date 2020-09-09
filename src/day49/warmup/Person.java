package day49.warmup;

import java.util.ArrayList;
import java.util.Arrays;

/*
warmup tasks:
create a class called Person
attributes:  name, age, gender
methods: eat, walk, sleep, setPersonInfo
 */
public class Person {
    public String name;
    public int age;
    public char gender;
    private long SSN;

    // read only
    public long getSSN() {
        return SSN;
    }

    // write only
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    // Not to let the subclass inherit these methods
    private void eat() {
        System.out.println(name + " is eating");
    }

    // Not to let the subclass inherit these methods
    private void walking() {
        System.out.println(name + " is walking");
    }

    // Let the subclass inherit these methods
    public void sleeping() {
        System.out.println(name + " is sleeping");
    }

    // Only sets name, age and gender
    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
/*
create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
 */

class Employee extends Person {
    public double salary;
    public long ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, long ID, String jobTitle) {
        setInfo(name,age,gender);
        this.salary = salary;
        this.ID=ID;
        this.jobTitle = jobTitle;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public String toString(){
        return "Name "+name+
                "\nAge "+age+
                "\nGender "+gender+
                "\nSalary "+salary+
                "\nID "+ID+
                "\nJob Title "+jobTitle;
    }
}

/*
 create a subclass of Employee called Testers
 Attributes:
 name, age, gender, Salary, ID, jobTitle
 Actions:
 setInfo(), smokeTesting(),  creatingTicket(), toString()
 */

class Tester extends Employee {
    double salary;
    long ID;
    String jobTitle;

    public Tester(String name, int age, char gender, double salary, long ID, String jobTitle) {
        setInfo(name, age, gender, salary, ID, jobTitle);

    }

    public void smokeTesting() {
        System.out.println("Tester "+name + " is smoke testing");
    }

    public void creatingTicket() {
        System.out.println("Tester "+name + " is creating ticket");
    }

}

/*
create a subclass of Employee called called Developer
                    Attributes:
                    name, age, gender, Salary, ID, jobTitle
                    Actions:
                    setInfo(), coding(),  fixBug(), toString()
 */

class Developer extends Employee {
    double salary;
    long ID;
    String jobTitle;

    public Developer(String name, int age, char gender, double salary, long ID, String jobTitle) {
        setInfo(name, age, gender, salary, ID, jobTitle);
    }


    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }
}

/*
create a class called ScrumTeam
   Attributes:
       ArrayList<Tester> testers = new ArrayList<>(),
       ArrayList<Developer> testers = new ArrayList<>(),
   Actions:
       addTester(Tester tester): adds the given tester to the testers arraylist
       addTesters(Tester[] testers): adds the given testers to the testers arraylist
       addDeveloper(Developer developer): adds the given developer to the developers arraylist
       addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
       removeTester(long employeeID): removes the given tester from the testers arraylist
       removeDeveloper(long employeeID): removes the developer from the developers arraylist
 */

class ScrumTeam {

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Tester tester) {
        if (testers.contains(tester)) {
            System.out.println("Tester is already in the list");
        } else {
            testers.add(tester);
        }
    }

    public void addTesters(Tester[] testers) {
        if (this.testers.containsAll(Arrays.asList(testers))) {
            System.out.println("Testers are already in the list");
        } else {
            this.testers.addAll(Arrays.asList(testers));
        }
    }

    public void addDeveloper(Developer developer) {
        if (developers.contains(developer)) {
            System.out.println("Developer is already in the list");
        } else {
            developers.add(developer);
        }
    }

    public void addDevelopers(Developer[] developers) {
        if (this.developers.containsAll(Arrays.asList(developers))) {
            System.out.println("Developers are already in the list");
        } else {
            this.developers.addAll(Arrays.asList(developers));
        }
    }


    public void removeTester(long ID) {
        testers.removeIf(p -> p.ID == ID);

    }

    public void removeDeveloper(long ID) {
        developers.removeIf(p -> p.ID == ID);

    }
}

/*
        create a class called AppleInc:
        1. create an array of Testers and store the testers info in your group
        2. create an array of developers store the developers info in your group
        3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
class AppleInc {
    public static void main(String[] args) {
        day49.warmupmuhtar.Tester tester1 = new day49.warmupmuhtar.Tester("Rakhat", 30, 'F', 125000, 123456, "SDET");
        day49.warmupmuhtar.Tester tester2 = new day49.warmupmuhtar.Tester("Murat",30,'M',110_000,10711453,"SDET");
        day49.warmupmuhtar.Tester tester3 = new day49.warmupmuhtar.Tester("Milovan",33,'M',125000,1,"SDET");

        day49.warmupmuhtar.Tester[] testers = {tester1, tester2, tester3};

        day49.warmupmuhtar.Developer developer1 = new day49.warmupmuhtar.Developer("Ebrahim", 31, 'M', 130000, 8765432, "SDET");
        day49.warmupmuhtar.Developer developer2 = new day49.warmupmuhtar.Developer("Ahmet",30,'M',150_000,10711453,"Lead Developer");
        day49.warmupmuhtar.Developer developer3 = new day49.warmupmuhtar.Developer("Yadigarjan", 40,'M', 120000, 3212313,"SDET");
        day49.warmupmuhtar.Developer developer4 = new day49.warmupmuhtar.Developer("fatime",30,'F', 150000,123456,"softwareEngineer");

        day49.warmupmuhtar.Developer[]developers={developer1,developer2,developer3,developer4};

        day49.warmupmuhtar.ScrumTeam scrum1=new day49.warmupmuhtar.ScrumTeam(testers,developers);
        System.out.println(scrum1);


        day49.warmupmuhtar.Tester[] testers2 = {
                new day49.warmupmuhtar.Tester("Aras", 23, 'M', 123000, 2397236, "SDET"),
                new day49.warmupmuhtar.Tester("Tulpar", 28, 'M', 120300, 71212233, "Test Analyst"),
                new day49.warmupmuhtar.Tester("Banu", 35, 'F', 156000, 9173321, "Test Manager")
        };
        day49.warmupmuhtar.Developer[] developers2 = {
                new day49.warmupmuhtar.Developer("Ismail", 34, 'M', 145000, 901733, "Full stack Developer"),
                new day49.warmupmuhtar.Developer("Sercan", 34, 'M', 140000, 713533, "Front End Developer"),
                new day49.warmupmuhtar.Developer("Omer", 28, 'M', 145000, 2362347, "Back End Developer")};

        day49.warmupmuhtar.ScrumTeam scrum2=new day49.warmupmuhtar.ScrumTeam(testers2,developers2);
        day49.warmupmuhtar.ScrumTeam[] allScrumTeams={scrum1,scrum2};

        for(day49.warmupmuhtar.ScrumTeam eachScrum:allScrumTeams){
            for(day49.warmupmuhtar.Tester eachTester:eachScrum.testers){
                System.out.println(eachTester.name+" "+eachTester.salary);
            }
        }
        System.out.println("+++++++++++++++++++++++");
        for(day49.warmupmuhtar.ScrumTeam eachScrum:allScrumTeams){
            for(day49.warmupmuhtar.Developer eachDeveloper:eachScrum.developers){
                System.out.println(eachDeveloper.name+" "+eachDeveloper.salary);
            }

        }
    }
}