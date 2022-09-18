package com.devbridge.search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class that handles file reading,
 * and searching for particular matches in that file's strings.
 */

public class BonusTaskStringSearcher {

    /** method that returns List<String>, where Strings in that list
     * has substrings which matches the Pattern given
     * and at least one of the match satisfies condition
     * (in our case match has to be equal or greater than given number (int))
     */

    public List<String> getStringsFromFile(String filePathAndName, Pattern pattern, int searchIntGreaterOrEqualTo) {

        String line = "";                                   // declaring empty string
        BufferedReader reader;                              // declaring BufferedReader
        List<String> outputList = new ArrayList<>();        // declaring empty list

        try {
            //trying to create new instance of BufferedReader
            reader = new BufferedReader(new FileReader(filePathAndName));

            while ((line = reader.readLine()) != null) {    // reading through lines, till there is any
                Matcher matcher = pattern.matcher(line);    // declaring matcher to match desired pattern
                while (matcher.find()) {                    // searching for matches in line (String)

                    //comparing match to the int given
                    if (Integer.parseInt(matcher.group()) >= searchIntGreaterOrEqualTo) {
                        outputList.add(line); // adding line (String) to outputList if the match satisfies the condition
                        break;                // breaking the inner loop at first match which satisfies the condition
                    }
                }
            }
            reader.close();                  // closing reader instance

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputList;                    // returning outputList
    }

}
