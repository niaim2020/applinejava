import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        wordsAscendings("test");
    }

    public static void wordsAscendings(String filepath) throws FileNotFoundException {
        Map<String, Integer> counterMap = new TreeMap<>();
        String text = readingFromFile(filepath);

        String[] words = text.split(" ");

        System.out.println("Слова в алфавитном порядке : Количество повторений слова");

        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        String key = null;
        int value = 0;
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry : counterMap.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > maxCount) maxCount = value;
            System.out.println(String.format(key + " : " + value));
        }

        for (Map.Entry<String, Integer> entry : counterMap.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.println(String.format("Слово с макс. кол-ом повторений " + key + " : " + value + " повтор."));
        }
    }

    public static String readingFromFile(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println("Слова в файле: " + Arrays.toString(words));
        scanner.close();
        return line;
    }
}
