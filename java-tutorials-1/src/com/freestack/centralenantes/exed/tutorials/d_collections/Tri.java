package com.freestack.centralenantes.exed.tutorials.d_collections;

import com.freestack.centralenantes.exed.tutorials.c_book.Chapter;

import java.util.*;
import java.util.stream.Collectors;

public class Tri {


    public ArrayList<String> createList(String text) {
        ArrayList<String> wordsNew = new ArrayList<>(
                Arrays.asList(text.toLowerCase(Locale.ROOT).replaceAll(",|!|:|\\?|\\.|\\\n", " ").split(" "))
        );
        return wordsNew;
    }

    public ArrayList<String> orderList(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }

    public void printList(ArrayList<String> list) {
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

    public ArrayList<String> listbylength(ArrayList<String> list, int length) {
        ArrayList<String> list2 = new ArrayList<>();

        list.forEach((word) -> {
            if (word.length() > length) {
                list2.add(word);
            }
        });

        return list2;
    }

    public ArrayList<String> listUnique(ArrayList<String> list) {
        TreeSet<String> listUnique = new TreeSet<>(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.clear();
        list2.addAll(listUnique);
        return list2;
    }

    public Map<String, Integer> analyzeList(ArrayList<String> list) {
        Map<String, Integer> analyzedList = new HashMap<>();

        // Comptage du nombre d'occurrance
        int compteur = 0;
        for (String item : list) {
            if (analyzedList.containsKey(item)) {
                compteur = analyzedList.get(item);
                analyzedList.replace(item, compteur + 1);
            } else {
                analyzedList.put(item, 1);
            }
        }

        // Ordonner la map selon l'ordre décroissant des occurrances
        Map<String, Integer> analyzedListSorted =
                analyzedList.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return analyzedListSorted;
    }

    public void printHashMap(Map<String, Integer> map) {
        map.forEach((String key, Integer value) -> {
            System.out.println(key + " : " + value);
        });
    }

    public void idWord(ArrayList<String> list, List<Chapter> book) {

        Map<String, Set<String>> index = new TreeMap<>();

        for (Chapter chapter : book) {
            ArrayList<String> wordsInChapter = new ArrayList<>(Arrays.asList(chapter.getContent().toLowerCase(Locale.ROOT).replaceAll(",|!|:|\\?|\\.|\\\n", " ").split(" ")));
            for (String word : wordsInChapter) {
                if (!index.containsKey(word)) {
                    Set<String> chapters = new LinkedHashSet<>();
                    chapters.add(chapter.getName());
                    index.put(word, chapters);
                } else {
                    index.get(word).add(chapter.getName());
                }
            }

//        index.forEach((word,chapterList)->{
//            System.out.println(word + " -- " + chapterList);
//        });

            for (Map.Entry<String, Set<String>> entry : index.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }


}
