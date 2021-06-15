package day02_printStatements;

public class ClassMates {

    public static void main(String[] args){
        System.out.println("   Aalia");
        System.out.println("   Sefika");
        System.out.println("   Ayhan");
        System.out.println("   Tahsin");
        System.out.println("   Zaiiadin");

        main(new int[]{2,3,4,5});
    }

    public static void main(int[] args) {
        int total=0;
        for (int i = 0; i <args.length ; i++) {
            total+=args[i];
        }
        System.out.println(total);
    }


}
