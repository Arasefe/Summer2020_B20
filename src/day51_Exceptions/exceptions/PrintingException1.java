package day51_Exceptions.exceptions;

public class PrintingException1 {
    public static void main(String[] args) {
        try {
            hop();
        } catch (RuntimeException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
        public static void hop () {
            throw new RuntimeException("can not hop");
        }
    }

