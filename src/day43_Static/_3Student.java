package day43_Static;



public class _3Student {
    // for the advantages of static

    String studentName;
    int age;
    char gender;
    static String schoolName = "Cybertek School";


    public void getInfo() {
        System.out.println("Name: " + studentName+" Age: "+age+" Gender: "+gender);
    }

    public static void printSchoolName() {
        System.out.println("School Name: " + schoolName);
    }



}

class A {
    static int a = 200;
}
