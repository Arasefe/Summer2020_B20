package day30_CustomMethods;

public class _4ReturnMethods {

    public static void main(String[] args) {
        String name = "Level";
        // reverseString1(name);
        // System.out.println(name.equalsIgnoreCase( reverseString1(name) ));


        System.out.println(name.equalsIgnoreCase(reverseString2(name)));

    }


    public static void reverseString1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }


    public static String reverseString2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }


}
