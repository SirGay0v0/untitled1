package org.example;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Wiki {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://ru.wikipedia.org/wiki/C%2B%2B").get();
            Elements elements = document.select("#mw-content-text > div.mw-parser-output > p:nth-child(4)");
//            System.out.println(elements);
            String str = elements.toString().replaceAll("[^а-я||А-Я||a-z||A-Z,+^\\s]", " ").trim().replaceAll
                    (" +", " ").replaceAll(" ,", ",");;

            System.out.println(str);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
