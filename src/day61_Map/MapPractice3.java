package day61_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {
        methodMap1();
    }

    public static void methodMap1() {
        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("East Turkistan", "Kashgar");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("Spain", "Madrid");
        countries.put("USA", "Washington");
        countries.put("Ukraine", "Kiev");
        countries.put("Azerbaijan", "Karabagh");
        countries.put("Turkey", "Ankara");
        countries.put("NH", "Concord");
        countries.put("Asmara", "Eritrea");
        countries.put("Srbija", "Belgrad");

        for (String eachCountry : countries.keySet()) {
            String eachCity = countries.get(eachCountry);

            System.out.println(eachCountry + "'s capital is: " + eachCity);

        }

        // country name is countryName, Capital city is cityName

    }
}
