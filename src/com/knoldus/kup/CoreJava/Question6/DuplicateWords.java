package com.knoldus.kup.CoreJava.Question6;
import com.knoldus.kup.CoreJava.Main;
public class DuplicateWords {
    public static void find(String str)
    {
        str = str.toLowerCase();
        int counter;
        String words[] = str.split(" ");
        for (int i=0; i<words.length; i++) {
            counter = 1;
            for (int j= i+1; j<words.length; j++){
                if(words[i].equals(words[j])) {
                    counter++;
                    words[j] = "0";
                }
            }
            if(counter > 1 && words[i] != "0")
                Main.print(words[i]+":"+counter);
        }
    }
    public static void main(String[] args) {
        DuplicateWords.find("Hello my name is Ranu Rajput Ranu Rajput is a Java Developer Ranu is working in Knoldus");
    }
}
