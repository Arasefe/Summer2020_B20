package day12_Switch_Scanner;
/*
2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
                invalid: month > 12 || months < 1

 */

public class DaysInMonth {

    public static void main(String[] args) {
        daysOfTheMonth1(13);
        daysOfTheMonth2(3);

    }

    private static void daysOfTheMonth1(int month){

        String result = "";

        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                result ="30 Days";
                break;
            case 2:
                result ="28 Days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result ="31 Days";
                break;
            default:
                result ="Invalid";
        }

        System.out.println(result);

    }
    private static void daysOfTheMonth2(int month){
        String result="";
        result=(month==2)?"28 Days":(month==4||month==6||month==9||month==11)?"30 Days"
                :(month==1||month==3||month==5||month==7||month==8||month==10||month==12)?"31 Days":"Invalid";
        System.out.println(result);
    }

}
