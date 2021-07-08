package day25_Practices;

public class _3ShortestString {

    public static void main(String[] args) {
        shortestString();

    }

    private static void shortestString() {
        String[] arr = {"Anama", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Musa", "Alan"};

        int minLength = arr[0].length();        //3

        for (String each : arr) {               // to find out the minimum length of the string in arr
            if (each.length() < minLength) {
                minLength = each.length();
            }
            if (each.length() == minLength) {   // to see how many strings' lengths in the array is matching with minLength
                System.out.println(each);
            }
        }
    }
}
