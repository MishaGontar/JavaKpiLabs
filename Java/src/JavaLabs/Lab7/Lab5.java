package JavaLabs.Lab7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lab5 {
    ArrayList <String> rareWords = new ArrayList<>();
    ArrayList <String> ourText = new ArrayList<>();


    public Lab5() {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mischa\\TA-Labs\\src\\JavaLabs\\Lab7\\file1.txt"))) {
            String line  = "";
            ArrayList<String> words = new ArrayList<String>();
            HashMap<String,Integer> map = new HashMap<>();

            while ((line = br.readLine()) != null) {
                String[] string = line.toLowerCase().split( "\\W+");
                words.addAll(Arrays.asList(string));
            }
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            ourText = (ArrayList<String>) words.clone();
            ArrayList<String> arrayList = new ArrayList<>();
            int rarWordInt = 0;

            for (String word: map.keySet()) {
                if (map.get(word)<=rarWordInt || rarWordInt == 0){
                    if (map.get(word) < rarWordInt){
                        arrayList.clear();
                    }
                    arrayList.add(word);
                    rarWordInt = map.get(word);

                }
            }
            rareWords =(ArrayList<String>) arrayList.clone();

            rareWords.stream().forEach(System.out::println);
            }
            catch (FileNotFoundException e){
            System.out.println("File is not found (((");
        }
        catch (IOException e) {
            System.out.println(" Something wrong .. ... ..");
        }
    }

    public ArrayList<String> getRareWords() {
        return rareWords;
    }

    public ArrayList<String> getOurText() {
        return ourText;
    }
}
