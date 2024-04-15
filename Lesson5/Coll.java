package Lesson5;

import java.util.*;

public class Coll {
    public static void main(String[] args) {
        String[] array = {"ananas", "apple", "apple", "appricot", "banana", "banana", "cherry", "cherry",
          "fig", "grape", "kiwi", "kiwi", "kiwi", "mango", "mango", "peach", "pear"};
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, array);
        HashSet<String> uniqWords = new HashSet<>();
        for (String words : list) {
            var add = uniqWords.add(words);
        }
        System.out.println("Список уникальных слов:" + " ");
        for (String words : uniqWords) {
            System.out.println(words);
        }
        System.out.println();

    }

    public static class Count {
        public static void main(String[] args) {
            String[] array2 = {"ananas", "apple", "apple", "appricot", "banana", "banana", "cherry", "cherry", "fig",
              "grape", "kiwi", "kiwi", "kiwi", "mango", "mango", "peach", "pear"};
            ArrayList<String> list2 = new ArrayList<String>();
            Collections.addAll(list2, array2);
            HashMap<String, Integer> countwords = new HashMap<>();
            for (String word : list2) {
                if (countwords.containsKey(word)) countwords.put(word, countwords.get(word) + 1);
                else {
                    countwords.put(word, 1);
                }
            }
            System.out.println("Количество слов");
            for (String word : countwords.keySet()) {
                System.out.println(word + ": " + countwords.get(word));
            }
        }
    }

}