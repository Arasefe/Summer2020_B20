package day0;
import Library.Util;
public class MethodCall {

    public static void main(String[] args) {

        String str = "Cybertek School";
        System.out.println(Util.reverse(str));

        String str2 = "abcabcaaaaabbbbbbcccccddddeeeeeee";
        System.out.println(Util.removeDup(str2));

        System.out.println(Util.maxNum(new int[]{1,2,3,4,5,6,7}));
    }

}
