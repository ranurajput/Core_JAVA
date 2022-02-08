package com.knoldus.kup.CoreJava.Question3;

import com.knoldus.kup.CoreJava.Main;

public class RemoveCharacter {
    public String removeCharacter(String str, char c){
        String newStr = "";
        for (int i =0; i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                continue;
            }
            else {
                newStr += String.valueOf(str.charAt(i));
            }
        }
        return newStr;

    }
    public static void main(String... args){
        RemoveCharacter rm = new RemoveCharacter();
        //String str = "hellomynameisranurajput";
        Main.print(rm.removeCharacter("abcdefabcdeabcdaaa", 'a')); //Output : bcdefbcdebcd
    }
}
