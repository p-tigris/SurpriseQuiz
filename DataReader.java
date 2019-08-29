package surprisequiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class DataReader {

    public static void main(String[] args) throws IOException {

        String container;
        String finalText = null;

        try {
            FileReader fileReader = new FileReader("src/surprisequiz/questions.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((container = bufferedReader.readLine()) != null) {
                finalText = container;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String [] words = finalText.split(" ");
        ArrayList<String> finalWords = new ArrayList<>();
        for (String word : words) {
            finalWords.add(word);
        }
        LinkedList<String> fileText = new LinkedList<>();
        for (String word: words) {
            fileText.add(word);
        }

        System.out.println(finalWords);
        System.out.println(fileText);
    }
}