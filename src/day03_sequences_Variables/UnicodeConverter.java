package day03_sequences_Variables;

import java.io.UnsupportedEncodingException;
import java.io.*;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class UnicodeConverter {
    public static void main(String[] args) {
        //String original = new String("A" + "\u004d" + "\u0045" + "\u0020" + "C");
        String original = new String("262 Greensboro Ct, Elk Grove Village IL");


        try {
            byte[] utf8Bytes = original.getBytes("UTF8");


            String roundTrip = new String(utf8Bytes, "UTF8");
            System.out.println("roundTrip = " + roundTrip);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }


    public static void printBytes(byte[] array, String name) {
        for (int k = 0; k < array.length; k++) {
            System.out.println(name + "[" + k + "] = " + "0x" +
                    UnicodeFormatter.byteToHex(array[k]));
        }

    }
}
