package day02_printStatements;

public class HelloCybertek {

    public static void main (String[] args){

        System.out.println("Hello Cybertek");
        System.out.println("Hello Batch 20");
        System.out.println("        I Love Java Programming Language");

        main(new Float[]{new Float(1),new Float(2),new Float(3)});
    }

    public static void main(Float[] args) {
        int multiply=1;
        for (int i = 0; i < args.length; i++) {
            multiply*=args[i];
        }
        System.out.println(multiply);
    }


}
