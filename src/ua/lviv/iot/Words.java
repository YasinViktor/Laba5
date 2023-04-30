package ua.lviv.iot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public void deleteVowelsGraterConsonants (String text) {
        Pattern patternVowels = Pattern.compile("[eyuioa]",Pattern.CASE_INSENSITIVE);
        Pattern patternConsonants = Pattern.compile("[qwrtpsdfghjklzxcvbnm]",Pattern.CASE_INSENSITIVE);
        Pattern patternWords = Pattern.compile("\\w+'*\\w*");
        Matcher words = patternWords.matcher(text);
        while (words.find()) {
            String word = words.group();
            Matcher matcherVowels = patternVowels.matcher(word);
            Matcher matcherConsonants = patternConsonants.matcher(word);
            int vowels = 0;
            int consonants = 0;
            while (matcherVowels.find()) vowels++;
            while (matcherConsonants.find()) consonants++;
            if (vowels > consonants) {
                text = text.replaceAll(word, "");
            }
        }
        System.out.println(text);
    }
}