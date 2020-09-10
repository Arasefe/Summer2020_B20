package day53.warmup;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
5. create a class called phone objects:
    create three objects of each phone and test everything out
 */
public class PhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("XP", 12.5, 1050, true);
        Nokia nokia = new Nokia("Nokia 8810", 4, 125, false);
        Samsung samsung = new Samsung("Galaxy", 12, 2000, true);

        System.out.println(iPhone.toString());
        System.out.println(nokia.toString());
        System.out.println(samsung.toString());

    }

}
