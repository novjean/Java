
package arraylistdemo;

import java.util.ArrayList;

/**
 * It still provides O(1) access. 
 when the vector is full, the array doubles in size. 
 each doubling takes O(n) times but it happens so rarely and the amortized time is O(1);
 * @author Novjean
 */
public class ArrayListDemo {
    
    public static ArrayList<String> sentence = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        String[] words = {"hello","world"};
        String[] more = {"it","is", "over"};
        
        merge(words, more);
        
        for(String w:sentence) System.out.println(w);       //Display all elements stored
        
        System.out.println(sentence.contains("is"));        //search for an element in the array
        
        sentence.remove("it");                              //Remove an element from the array
        for(String w:sentence) System.out.println(w);       
        
        System.out.println(sentence.indexOf("over"));       //Display the index of an element within array
        
    }
    
    public static void merge(String[]words, String[] more){
        
        for(String w: words) sentence.add(w);
        for(String w: more) sentence.add(w);
        
    }
}
