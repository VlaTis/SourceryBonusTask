package com.devbridge.console;

import java.util.List;

/** Class that prints output to console */

public class BonusTaskConsoleMessenger {

    /** method that prints List<String> in needed format */
    public static void print(List<String> someList) {
        if (someList.isEmpty()) {
            System.out.println("No records/elements found!");
        } else {
            for (String str : someList) {
                System.out.println(str);
            }
        }
    }


    public static void printWelcome() {
        System.out.println("-===== Bonus Task App ======-");
    }
}
