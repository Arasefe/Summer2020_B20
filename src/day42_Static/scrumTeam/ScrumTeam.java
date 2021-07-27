package day42_Static.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ScrumTeam {

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        if(!testers.contains(tester)){
            testers.add(tester);
        }

    }

    public void addTester(Tester[] testers) {
        if (testers.length == 0) {
            return;
        }
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(long employeeID) {     // 007
        Predicate<Tester>matchingTester=p->p.employeeID == employeeID;
        testers.removeIf(p -> p.employeeID == employeeID);
        //              each employee id,  == 007
        //testers.removeIf(matchingTester);

    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        if (developers.length == 0) {               // to check if the array is empty
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }


    public void removeDeveloper(long employeeID) {
        Predicate<Developer>matchingDeveloper=p->p.employeeID==employeeID;
        //developers.removeIf(p -> p.employeeID == employeeID);
        developers.removeIf(matchingDeveloper);
    }


    public String toString() {
        return testers.size() + " testers, " + developers.size() + " developers, PO: " + PO + ", BA: " + BA + ", SM: " + SM;
    }

    /*
    team1
    team2
    team3
     */

}
