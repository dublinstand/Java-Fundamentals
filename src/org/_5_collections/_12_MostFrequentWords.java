package org._5_collections;

//Write a program to find the most frequent word in a text and print it, as well as how many times it
// appears in format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing.
// If several words have the same maximal frequency, print all of them in alphabetical order.
import java.util.*;
import java.util.stream.Collectors;

public class _12_MostFrequentWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] wordsArray = scanner.nextLine().toLowerCase().split("\\W+");

        //put the array in a list
        List<String> words = Arrays.asList(wordsArray);

        //use Collectors to put the list into a Map
        Map<String,Long> allWords = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        //set a max size
        long maxSize = Collections.max(allWords.values());

        //put the map in a TreeMap with Collectors
        TreeMap<String,Long> result = allWords
                .entrySet()
                .stream()
                .filter(x->x.getValue() == maxSize)
                .collect(Collectors.toMap(
                        p->p.getKey(),
                        p->p.getValue(),
                        (a,b)->a,
                        TreeMap::new));

        for (String key : result.keySet()) {
            System.out.printf("%s -> %d times\n", key, maxSize);
        }


    }
}


