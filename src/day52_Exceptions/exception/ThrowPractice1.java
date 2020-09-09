package day52_Exceptions.exception;

import java.time.LocalDate;
import java.time.LocalTime;

public class ThrowPractice1 {
    public static void main(String[] args) {
        String driverName = "chrome";

        switch (driverName) {
            case "Chrome Driver":
                System.out.println("Setting up " + driverName);

            case "FireFox Driver":
                System.out.println("Setting up " + driverName);

            case "Opera Driver":
                System.out.println("Setting up " + driverName);

            case "Edge Driver":
                System.out.println("Setting up " + driverName);

            case "InternetExplorer":
                System.out.println("Setting up " + driverName);

            default:
                throw new RuntimeException("Invalid Browser name");
        }

    }
}
