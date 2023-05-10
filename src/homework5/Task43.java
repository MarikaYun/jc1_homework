package homework5;

import java.util.*;

public class Task43 {
    public static void main(String[] args) {
        String textNews = "In the early days of the coronavirus pandemic, the US Centers for Disease Control " +
                "and Prevention issued a public health order that officials said aimed to stop the spread " +
                "of Covid-19. The order allowed authorities to swiftly expel migrants at US land borders. " +
                "The policy is widely known as Title 42, for the portion of US code that allowed the CDC" +
                " director to issue it.";

        String[] textWords = textNews.split("\\p{Punct}* +");
        System.out.println(Arrays.toString(textWords));
        System.out.println(textWords.length + " - words");

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : textWords) {
            if (wordsMap.containsKey(word)) {
                int wordsCount = wordsMap.get(word);
                wordsMap.put(word, ++wordsCount);
            }else{
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    }
}
