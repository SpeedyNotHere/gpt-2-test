import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File words = new File("vocab.txt");
        File training = new File("training.txt");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(words);
        ArrayList<String> wordList = new ArrayList<>();
        HashMap<String, Integer> tokenID = new HashMap<>();
        HashMap<String, Double> contextWeight = new HashMap<>();
        int i = 0;


        while (b.hasNextLine()) {
            String word = b.nextLine();
            wordList.add(word);
            tokenID.put(word, i);

            i++;
        }

        int randomInt = (int)(Math.random() * wordList.size());
        String randomWord = wordList.get(randomInt);
        System.out.println(randomWord);
        System.out.println(tokenID.get(randomWord));
    }
}