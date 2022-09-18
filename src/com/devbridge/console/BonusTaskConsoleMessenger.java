package com.devbridge.console;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Class that prints output to console
 */

public class BonusTaskConsoleMessenger {

    /**
     * method that prints List<String> in needed format
     */
    public static void print(List<String> someList) {
        if (someList.isEmpty()) {
            System.out.println("No records/elements found!");
        } else {
            for (String str : someList) {
                System.out.println(str);
            }
        }
    }

    /**
     * method that prints hardcoded welcome message
     */

    public static void printWelcome(String filePathName, Pattern pattern, int comparableInt) {
        System.out.println(
                "-===== Bonus Task App ======- \n\n" +
                        "Current settings: \n" +
                        "-- Full file path and name => " + filePathName + "\n"
                        + "-- Regex pattern => " + pattern.toString() + "\n"
                        + "-- Comparable Number => " + comparableInt + "\n"
                        + "----------------------------\n" +
                        "Output of Matches: \n");
    }
}
