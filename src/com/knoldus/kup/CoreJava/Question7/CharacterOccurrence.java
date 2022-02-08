package com.knoldus.kup.CoreJava.Question7;
import com.knoldus.kup.CoreJava.Main;
public class CharacterOccurrence {
    public static int findChar(String str, char c) {
        int count = 0;
        str = str.toLowerCase();
        if (str.length() < 1) {
            return 0;
        }
        if (str.charAt(0) == c) {
            count++;
        }
        count += findChar(str.substring(1), c);
        return count;
    }

    public static void main(String[] args) {
        String str = "hellomynameisranurajputiamajavadevelopermmmmmmmmm";
        char c = 'm';
        System.out.print("Occurrence of "+c +" : ");
        Main.print(CharacterOccurrence.findChar(str, c));//output --> Occurrence of m : 12

    }
}