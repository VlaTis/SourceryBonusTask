package com.devbridge;

public class Main {

    public static void main(String[] args) {

        new BonusTaskInit(
                "././bonusTaskMock.txt",
                "\\d+",
                11).run();
    }
}
