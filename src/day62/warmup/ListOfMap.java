package day62.warmup;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.scene.input.InputMethodTextRun;

import java.time.LocalDate;
import java.util.*;

/*
Warmup tasks:
    1. crete a 3 LinkedHashMaps that contains employee name and jobTitle
    2. create a List of Map and store all LinkedHashMaps objects into the list.
    3. Iterate each objects from the list and print out the name of the employee if the jobTitle of the employee is SDET
 */
public class ListOfMap {
    public static void main(String[] args) {
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Hasan", "SDET");
        scrumTeam1.put("Banu", "QA");
        scrumTeam1.put("Aras", "Scrum Master");
        scrumTeam1.put("Tulpar", "Technical Test Analyst");
        scrumTeam1.put("Efe", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("John", "SDET");
        scrumTeam2.put("Marharyta", "QA");
        scrumTeam2.put("James", "Scrum Master");
        scrumTeam2.put("Frank", "Test Analyst");
        scrumTeam2.put("Mike", "QA");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("Eylem", "QA");
        scrumTeam3.put("Robert", "PO");
        scrumTeam3.put("Ahmet", "Scrum Master");
        scrumTeam3.put("Naz", "Test Analyst");
        scrumTeam3.put("Guljannat", "QA");


        List<Map<String, String>> teams = Arrays.asList(scrumTeam1, scrumTeam2, scrumTeam3);


        for (Map<String, String> eachList : teams) {
            for (String eachKey : eachList.keySet()) {
                String eachValue = eachList.get(eachKey);
                if (eachValue.equals("SDET")) {
                    System.out.println(eachKey);
                }
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++");

        for (Map<String, String> eachTeam : teams) {
            for (String eachKey : eachTeam.keySet()) {
                String eachValue=eachTeam.get(eachKey);
                if(eachValue.equals("PO")) System.out.println(eachKey);
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++");
        for (Map<String, String> eachTeam : teams) {
            for (String eachKey : eachTeam.keySet()) {
                String eachValue=eachTeam.get(eachKey);
                if(eachValue.equals("Test Analyst")){
                    System.out.println(eachKey);
                }
            }
        }

        System.out.println("+++++++++++++++++++++++++++++++++");

        for (Map<String, String> eachTeam :teams ) {
            for (String eachKey : eachTeam.keySet()) {
                String eachValue=eachTeam.get(eachKey);
                if(eachValue.equals("Scrum Master")){
                    System.out.println(eachKey);
                }
            }
        }
    }
}
