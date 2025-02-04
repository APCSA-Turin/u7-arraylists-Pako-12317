package U7T3;

import java.util.ArrayList;

public class DoNow {
    public static void main(String[] args) {
            
        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

        // use a for loop here to print out the words in reverse order

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).startsWith("h")){
                break;
            }else{
                System.out.println(words.get(i));
            }
        }

    }
}
