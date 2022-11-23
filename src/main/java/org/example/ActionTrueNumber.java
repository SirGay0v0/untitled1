package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActionTrueNumber {
    public static void examination(String number) {
        String regex = "^((8|\\+7)[\\-]?)?(\\(?\\d{3}\\)?[\\-]?)?[\\d\\-]{7,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        System.out.println(number + " - " + matcher.matches());
    }
}
