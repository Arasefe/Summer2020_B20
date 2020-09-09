package day51_Exceptions.superKeyword;


class X{
    public X(){
        System.out.println("X");
    }
}

class Y extends X{
    public Y(){
        System.out.println("Y");
    }
}

class Z extends Y{
    public Z(){
        System.out.println("Z");
    }
}

public class Practice {
    public static void main(String[] args) {
        new Z();
    }
}
