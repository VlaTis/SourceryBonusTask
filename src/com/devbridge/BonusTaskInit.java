package com.devbridge;

import com.devbridge.console.BonusTaskConsoleMessenger;
import com.devbridge.files.BonusTaskStringSearcher;
import java.util.regex.Pattern;

/** Class that initiates program
 * and requires full filepath with file name as a single String,
 * regex Pattern to declare what exactly to search in Strings (in our case numbers)
 * and int which is compared to substrings
 * */

public class BonusTaskInit {

    private final String filePathAndName;               // file path with full filename (with extension)
    private final Pattern pattern;                      // Pattern (regex expression)
    private final int searchIntGreaterOrEqualTo;        // int to compare to matches


    public BonusTaskInit (String filePathAndName, String stringPattern, int searchIntGreaterOrEqualTo ){
        this.filePathAndName = filePathAndName;
        this.pattern = Pattern.compile(stringPattern);
        this.searchIntGreaterOrEqualTo = searchIntGreaterOrEqualTo;

    }

    /**
     * method that creates necessary instances to run the program
     */
    public void run(){
        BonusTaskStringSearcher reader = new BonusTaskStringSearcher();
        BonusTaskConsoleMessenger.printWelcome(filePathAndName, pattern, searchIntGreaterOrEqualTo);
        BonusTaskConsoleMessenger.print(reader.getStringsFromFile(
                filePathAndName,
                pattern,
                searchIntGreaterOrEqualTo));

    }



}
