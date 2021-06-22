package day10_ifStatements;

public class MultiBranch {

    public static void main(String[] args) {
        singleBranch(3);
        multiBranchIf(12);
    }
    public static void singleBranch(int number){

        if(number > 0){
            System.out.println(number +" is positive");
        }

        if(number < 0){
            System.out.println(number+ " is negative");
        }

        if(number == 0){
            System.out.println(number + " is zero");
        }

    }

    public static void multiBranchIf(int number){
        if(number > 0){
            System.out.println(number+" is positive");
        }else if(number < 0){
            System.out.println(number+" is negative");
        } else  {
            System.out.println(number +" is zero");
        }

    }

}
