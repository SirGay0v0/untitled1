package org.example;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static String [] getDate(String desc){
        int count = 0;
        String[] allMatches = new String[2];
        Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](21|20)\\d\\d").matcher(desc);

        while (m.find()){
            allMatches[count] = m.group();
            count++;
        }
        return allMatches;
    }

    public static void main(String[] args) {

        String[] dates = getDate("Начальная дата 25/11/2021 конечная дата 30/11/2022");
        System.out.println(dates[0]);
        System.out.println(dates[1]);

//        String str = "Java Java снова Java ".trim();
//        String regex = "Java";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
//        int count = 0;
//
//        while (matcher.find()){
//            count++;
//            System.out.println("Finding: " + count + " : " + matcher.start() + " - " + matcher.end());
//        }
    }
}
