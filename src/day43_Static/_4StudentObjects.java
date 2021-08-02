package day43_Static;

public class _4StudentObjects {

    public static void main(String[] args) {

        _3Student obj1 =new _3Student();
        obj1.studentName = "Ivan";

        _3Student obj2 =new _3Student();
        obj2.studentName = "Cristina";

        _3Student obj3 =new _3Student();
        obj3.studentName = "Aras";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);
        System.out.println(obj3.studentName);

        System.out.println(obj1.schoolName);
        System.out.println(obj2.schoolName);
        System.out.println(obj3.schoolName);
        System.out.println( _3Student.schoolName );

    }
}
