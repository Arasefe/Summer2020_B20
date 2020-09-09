package day47_Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitalOneEmployees employee1=new CapitalOneEmployees("Daniel",32,"SDET");
        employee1.setID(1234121);
        employee1.setAddress("262 Greensboro Ct. Elk Grove Village, 60007, IL");
        employee1.setSalary(123500);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

    }
}
