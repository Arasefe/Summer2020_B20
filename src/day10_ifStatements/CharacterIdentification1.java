package day10_ifStatements;

public class CharacterIdentification1 {
    /*
    Write a program if given character is Alphabetic
     */
    public static void main(String[] args) {
        isAlphabetic('a');
        isDigit('3');
        isSpecialChar('#');

    }

    public static boolean isAlphabetic(char character) {

        //  65 <= character <= 90   ||   97 <= character <= 122
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //  upper case letters     ||  lower Case letter

        if (isAlphabetic) {
            System.out.println(character + " is Alphabetic character");
            return true;

        } else {
            System.out.println(character + " is not Alphabetic character");
            return false;
        }
    }

    public static boolean isDigit(char character) {

        // 48 <= CHARACTER <= 57
        boolean isDigit = character >= 48 && character <= 57;


        if (isDigit) {
            System.out.println(character + " is Digit character");
            return true;
        } else {
            System.out.println(character + " is not Digit character");
            return false;
        }

    }


    public static boolean isSpecialChar(char character){
        // !isAlphabetic && !isDigit

        boolean specialChar = isAlphabetic(character) == false && isDigit(character) == false;

        if (specialChar) {
            System.out.println(character + " is Special character");
            return true;
        } else {
            System.out.println(character + " is not Special character");
            return false;
        }
    }

}
