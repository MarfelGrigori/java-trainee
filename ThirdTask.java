import java.util.HashMap;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String vowels = "аеёиоуэюяы";
        int countVowels = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            for (Character charBox : word.toLowerCase().toCharArray()) {
                if (vowels.contains(charBox.toString())) {
                    if (countVowels == 0) {
                        word = word.replaceFirst(charBox.toString(), charBox.toString().toUpperCase());
                    }
                    countVowels++;
                }
            }
            map.put(word, countVowels);
            countVowels = 0;
        }
        map.entrySet().stream()
                .sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
