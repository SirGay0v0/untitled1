package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActionTrueEmail {
    public static void examination(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + " - " + matcher.matches());
    }
}
