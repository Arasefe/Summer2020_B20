package day29_CustomMethods;

public class _11RemoveDuplicates {

    //10. write a method that can remove the duplicates from the string

    public static void main(String[] args) {
        String str = "ababababababcccccccccddddddddeeeeee";
        //"abcde"

        removeDup(str);

    }


    public static void removeDup(String str) {
        String nonDup = "";
        String []arr=str.split("");

        for (String each : arr) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }


}
