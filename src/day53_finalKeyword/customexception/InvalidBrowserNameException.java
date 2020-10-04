package day53_finalKeyword.customexception;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException(){
        super("Invalid Browser Name");
    }

    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("Are you kidding");
    }

}


class Test2{
    public static void main(String[] args) {
        String name="cybertek";
        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome browser is setting up...");
                break;
            case "firefox":
                System.out.println("Firefox browser is setting up...");
                break;
            case "safari":
                System.out.println("safari browser is setting up...");
                break;
            default:
                throw new InvalidBrowserNameException("Please enter a valid browser name");
        }
        //  throw new InvalidBrowserNameException();

    }
}