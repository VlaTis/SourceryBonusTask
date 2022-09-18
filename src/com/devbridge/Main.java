package com.devbridge;

public class Main {

    public static void main(String[] args) {

        String filePathAndName = "././bonusTaskMock.txt";
        String pattern = "\\d+";
        int searchIntGreaterOrEqualTo = 10;

        new BonusTaskInit(
                filePathAndName,
                pattern,
                searchIntGreaterOrEqualTo).run();
    }
}
