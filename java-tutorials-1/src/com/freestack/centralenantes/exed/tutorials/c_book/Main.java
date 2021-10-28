package com.freestack.centralenantes.exed.tutorials.c_book;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    static String nearestChapter(Chapter[] chapters, int page) {
//        int nearestChapterPage;
//        for (int index = 0; index < chapters.length-1; index++){
//            int chapterPage = chapters[index].getPage();
//            int nextChapterPage = chapters[index+1].getPage();
//            if ((page-chapterPage) < (page-nextChapterPage)){
//                nearestChapterPage = chapterPage;
//            } else {
//                nearestChapterPage = nextChapterPage;
//            }
//        }
//
        return "";
    }

    public static void main(String[] args) {
        String nChap_1 = nearestChapter(new Chapter[] {
                new Chapter("Chapter 1", 1),
                new Chapter("Chapter 2", 15),
                new Chapter("Chapter 3", 37)
        }, 10);

        if (!nChap_1.equals("Chapter 2")) {
            throw new AssertionError(nChap_1 + "!==" + "Chapter 2");
        }

        String nChap_2 = nearestChapter(new Chapter[] {
                new Chapter("New Beginnings", 1),
                new Chapter("Strange Developments", 62),
                new Chapter("The End?", 194),
                new Chapter("The True Ending", 460)
        }, 200);

        if (!nChap_2.equals("The End?")) {
            throw new AssertionError(nChap_2 + "!==" + "The End?");
        }

        String nChap_3 = nearestChapter(new Chapter[] {
                new Chapter("Chapter 1a", 1),
                new Chapter("Chapter 1b", 5)
        }, 3);

        if (!nChap_3.equals("Chapter 1b")) {
            throw new AssertionError(nChap_3 + "!==" + "Chapter 1b");
        }

        String nChap_4 = nearestChapter(new Chapter[] {
                new Chapter("Once upon a time", 1),
                new Chapter("A family and much children", 5)
        }, 6);

        if (!nChap_4.equals("A family and much children")) {
            throw new AssertionError(nChap_4 + "!==" + "A family and much children");
        }

        System.out.println("Success!");

    }
}
