package day62;

import java.util.*;

public class ListOfMaps1 {
    public static void main(String[] args) {
        Map<String, String> scrumTeam1 = new LinkedHashMap<>(); //retains insertion order
        scrumTeam1.put("Hasan", "SDET");
        scrumTeam1.put("Banu", "QA");
        scrumTeam1.put("Aras", "Scrum Master");
        scrumTeam1.put("Tulpar", "Technical Test Analyst");
        scrumTeam1.put("Efe", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>(); //retains insertion order
        scrumTeam2.put("John", "SDET");
        scrumTeam2.put("Marharyta", "QA");
        scrumTeam2.put("James", "Scrum Master");
        scrumTeam2.put("Frank", "Test Analyst");
        scrumTeam2.put("Mike", "QA");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>(); //retains insertion order
        scrumTeam3.put("Eylem", "SDET");
        scrumTeam3.put("Robert", "PO");
        scrumTeam3.put("Ahmet", "Scrum Master");
        scrumTeam3.put("Naz", "Test Analyst");
        scrumTeam3.put("Guljannat", "QA");


        List<Map<String, String>> teams = new ArrayList<>();
        teams.addAll(Arrays.asList(scrumTeam1,scrumTeam2,scrumTeam3));

        System.out.println(teams);

        for (Map<String, String> eachMap : teams) {
            System.out.println(eachMap);
            for (Map.Entry<String, String> each : eachMap.entrySet()) {
                String name=each.getKey();
                String jobTitle=each.getValue();
                if(jobTitle.equals("SDET")){
                    System.out.println(name);
                }
            }
        }
    }
}
