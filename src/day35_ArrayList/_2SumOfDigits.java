package day35_ArrayList;
/*
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

 */

public class _2SumOfDigits {
    public static void main(String[] args) {
//        sumOfAllDigitsOfAString1();
//        sumOfAllDigitsOfAString2();
        sumOfAllDigitsOfAString3("a2r0a1s4e9f64e");

    }

    private static void sumOfAllDigitsOfAString1() {
        String str = "a1b2c3d4e5f6";
        int sum = 0;

        for (int i = 0; i <= str.length() - 1; i++) {

            char each = str.charAt(i);                  // a, 1, b,2,c,3

            if (each >= 48 && each <= 57) {             // if the char is between 48~57 , then it's digit

                sum += Integer.parseInt("" + each);   // convert the char to Integer then add it to the sum
                //   sum += each - 48;
            }

        }

        System.out.println(sum);


    }

    private static void sumOfAllDigitsOfAString2() {
        String str = "a1b2c3d4e5f6";
        int sum = 0;

        for (char each : str.toCharArray()) {
            if (each >= 48 && each <= 59) {
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println(sum);


    }

    private static void sumOfAllDigitsOfAString3(String str) {
        /*
    Character:
    isDigit(char): verifies if the char is digit, returns boolean
    isLetter(char): verifies if the char is letter, returns boolean
     */
        int sum = 0;
        StringBuilder letters = new StringBuilder();
        String digits = "";
        for (char each : str.toCharArray()) {   //[a,1,b,2,c,3,d,4,e,5,f,6]
            if (Character.isDigit(each)) {
                digits += each;
                sum += Integer.parseInt(""+each);
            } else if (Character.isLetter(each)) {
                letters.append(each);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(sum);
    }
}