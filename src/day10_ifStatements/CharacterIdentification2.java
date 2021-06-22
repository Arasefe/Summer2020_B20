package day10_ifStatements;

public class CharacterIdentification2 {
    public static void main(String[] args) {
        isAlphabetic('a');
        isDigit('3');
        isSpecialChar('#');
    }

    public static boolean isAlphabetic(char character){

        boolean isAlphabetic=Character.isAlphabetic(character);
        if(isAlphabetic) {
            System.out.println(character + " is Alphabetic character");
        }
        return isAlphabetic;
    }
    public static boolean isDigit(char character){
        boolean isDigit=Character.isDigit(character);
        if(isDigit) {
            System.out.println(character + " is Digit character");
        }
        return isDigit;
    }
    public static boolean isSpecialChar(char character){
        boolean isSpecial= !isAlphabetic(character) && !isAlphabetic(character);
        if(isSpecial){
            System.out.println(character + " is Special character");

        }
        return isSpecial;

    }
}
