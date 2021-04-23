package JavaLabs.Lab7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ThreadModel extends Thread{
    private String name ;
    HashMap <String, Integer> rareWords = new HashMap<>();

    ThreadModel(String fileName){
        this.name = fileName;
        setName("Thread_FileDir_" + name);
        System.out.println("Thread is created " + name );
    }

    @Override
    public void run(){
        try(BufferedReader br = new BufferedReader(new FileReader(name))) {
            String line  = "";
            ArrayList<String> words = new ArrayList<>();
            HashMap<String,Integer> map = new HashMap<>();

            while ((line = br.readLine()) != null) {
                String[] string = line.toLowerCase().split( "\\W+");
                words.addAll(Arrays.asList(string));
            }
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            rareWords = searchRareWords(map);
        }
        catch (FileNotFoundException e){
            System.out.println("File is not found (((");
        }
        catch (IOException e) {
            System.out.println(" Something wrong .. ... ..");
        }
    }

    public static synchronized  HashMap<String, Integer> searchRareWords(HashMap<String,Integer> map){
        HashMap <String, Integer> rareWordsH = new HashMap<>();
        int rarWordInt = 0;

        for (String word: map.keySet()) {
            if (map.get(word)<=rarWordInt || rarWordInt == 0){
                if (map.get(word) < rarWordInt){
                    rareWordsH.clear();
                }
                rareWordsH.put(word,map.get(word));
                rarWordInt = map.get(word);
            }
//            System.out.println("Rare word  : " + word);
//            System.out.println("Rare count  : " + map.get(word));
        }
//        System.out.println("rare word count : " + map.values());
        return rareWordsH;
    }

}
