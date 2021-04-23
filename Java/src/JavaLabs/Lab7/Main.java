package JavaLabs.Lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList <String> listOfFiles = new ArrayList<>();

        listOfFiles.add("C:\\Users\\Mischa\\TA-Labs\\src\\JavaLabs\\Lab7\\files\\file1.txt");
        listOfFiles.add("C:\\Users\\Mischa\\TA-Labs\\src\\JavaLabs\\Lab7\\files\\file2.txt");
        listOfFiles.add("C:\\Users\\Mischa\\TA-Labs\\src\\JavaLabs\\Lab7\\files\\file3.txt");
        listOfFiles.add("C:\\Users\\Mischa\\TA-Labs\\src\\JavaLabs\\Lab7\\files\\file4.txt");
        listOfFiles.add("C:\\Users\\Mischa\\TA-Labs\\src\\JavaLabs\\Lab7\\files\\file5.txt");

        readListOfFiles reads = new readListOfFiles(listOfFiles);
        reads.readFiles();
    }
}
