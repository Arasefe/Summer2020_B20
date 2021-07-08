package day25_Practices;

public class _5CountOddEven {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,100, -100, -200, 400, 50000, 10000000, 123};
        int countEven = 0;
        int countOdd = 0;

        String evenNumbers = "";
        String oddNumbers = "";

        for( int each : nums){

            if(each %2 ==0){
               countEven += 1;
                evenNumbers += each+" ";
           }else{
               countOdd++;
                oddNumbers += each+" ";;
           }

        /*
           if(each %2 ==0){
               countEven += 1;
               even += each+" ";
               continue;
           }
           countOdd++;
           odd += each+" ";

        */

        }


        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println(countEven);
        System.out.println("Odd Numbers: "+oddNumbers);
        System.out.println(countOdd);





    }

}
