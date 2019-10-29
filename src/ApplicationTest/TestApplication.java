package ApplicationTest;

import java.util.ArrayList;

public class TestApplication {
    // define database of usable characters
    static void usableCharacters(){
        String[] usableLetters_L = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        ArrayList<String> usableLetters_U = new ArrayList<String>();

        for (int x = 0; x < usableLetters_L.length; x++){
            usableLetters_U.add(usableLetters_L[x].toUpperCase());

        }
        System.out.println("This is the lowercase array: " + usableLetters_L + " .");
        System.out.println("This is the uppercase array" + usableLetters_U + " .");

    }


    public static void main(String[] args) {
        usableCharacters();
    }
}
