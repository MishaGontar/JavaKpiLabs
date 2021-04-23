package JavaLabs.Lab7;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class readListOfFiles {
    private ArrayList<String> files;
    private HashMap<String, Integer> rareWords;

    public readListOfFiles(ArrayList<String> files){
        this.files = files;

    }
    public void readFiles() {
        System.out.println("==============================| Кількома потоками | =================================================");
            Instant starts = Instant.now();
            rareWords = rareWordsInFiles(files);
            Instant ends = Instant.now();
            System.out.println("Відповідь: " +
                    " виконано за " +  Duration.between(starts, ends).toNanos() + " ns; (Millis) :" + Duration.between(starts, ends).toMillis() + " ms "
            );
        System.out.println("==============================| Один поток | =================================================");
            Instant starts1 = Instant.now();
            rareWords = rareWordsInFilesOne(files);
            Instant ends1 = Instant.now();
            System.out.println("Відповідь: " +
                    " виконано за " +  Duration.between(starts1, ends1).toNanos() + " ns; (Millis) :" + Duration.between(starts, ends).toMillis() + " ms "
            );
        System.out.println("==============================| Слова які повторюється найрідше в файлах | =================================================");
        print();
        }

    private  HashMap<String, Integer> rareWordsInFiles( ArrayList<String> files) {
        HashMap <String, Integer> rareWordsInFilesb = new HashMap <>();
        List<ThreadModel> threads = new ArrayList<>();
        ThreadModel at;
        for (String file : files) {
        at = new ThreadModel(file);
        threads.add(at);
        at.start();
        }
        for(ThreadModel t : threads){
            try {
                t.join();
                for (String word : t.rareWords.keySet()){
                    rareWordsInFilesb.put(word, rareWordsInFilesb.getOrDefault(word,0) + t.rareWords.get(word));
//                    System.out.println("Word : " + word + "| Count : " + t.rareWords.get(word));
                }
                System.out.println("Моніторінг: " + t.getName() + " result " + rareWordsInFilesb.values());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        HashMap <String, Integer> rareWordsInFilesA = ThreadModel.searchRareWords(rareWordsInFilesb);
        return rareWordsInFilesA;
    }
    private  HashMap<String, Integer> rareWordsInFilesOne( ArrayList<String> files) {
        HashMap <String, Integer> rareWordsInFilesb = new HashMap <>();
        List<ThreadModel> threads = new ArrayList<>();
        ThreadModel at;

        for (String file : files) {
            at = new ThreadModel(file);
            threads.add(at);
        }
        for(ThreadModel t : threads){
                t.run();
                for (String word : t.rareWords.keySet()){
                    rareWordsInFilesb.put(word, rareWordsInFilesb.getOrDefault(word,0) + t.rareWords.get(word));
//                    System.out.println("Word : " + word + "| Count : " + t.rareWords.get(word));
                }
                System.out.println("Моніторінг: " + t.getName() + " result " + rareWordsInFilesb.values());

        }
        HashMap <String, Integer> rareWordsInFilesA = ThreadModel.searchRareWords(rareWordsInFilesb);
        return rareWordsInFilesA;
    }
    public  void  print(){
        for (String word : rareWords.keySet()){
            System.out.println("Word : " + word + " | Count : " + rareWords.get(word) );
        }
    }
}
