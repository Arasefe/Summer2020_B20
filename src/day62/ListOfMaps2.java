package day62;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {
    public static void main(String[] args) {
        String[]friends={"Ahmet","Ramazan","Musa","Cihan","Eylul"};
        LocalDate[]dobFriends={LocalDate.of(1985,2,3),
                LocalDate.of(1980,4,18),
                LocalDate.of(1987,8,23),
                LocalDate.of(1975,6,3),
                LocalDate.of(1987,12,9),

        };

        String[]classMates={"Alibek","Elmira","Boris","Marharyta","Ayse"};

        LocalDate[]dobMates={LocalDate.of(1985,2,3),
                LocalDate.of(1986,9,10),
                LocalDate.of(1984,1,23),
                LocalDate.of(1989,6,3),
                LocalDate.of(1987,9,9),

        };
        String[]family={"Ismail","Banu","Aras","Tulpar"};

        LocalDate[]dobFamily={LocalDate.of(1977,1,1),
                LocalDate.of(1982,4,4),
                LocalDate.of(2014,9,13),
                LocalDate.of(2016,6,17),

        };

        List<Map<String, LocalDate>> list=new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));

        for (int i = 0; i < family.length; i++) {
            list.get(0).put(friends[i],dobFriends[i]);
        }

        for (int i = 0; i < friends.length; i++) {
            list.get(1).put(classMates[i],dobMates[i]);
        }

        for (int i = 0; i < family.length; i++) {
            list.get(2).put(family[i],dobFamily[i]);
        }
    }
}
