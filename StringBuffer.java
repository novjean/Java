
package stringbufferdemo;

/**
 * the time complextiy for using String BUffer is O(n^2). Yes, Ouch !!!
 * @author Novjean
 */
public class StringBufferDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words= {"hello","world","boom"};
        
        String sentence = MakeSentence(words);
        
        System.out.println("Sentence is " + sentence);
        
        System.out.println(sentence.charAt(1));         //read characters at index position
        
        
    }
    
    public static String MakeSentence(String[] words){
        
        StringBuffer sentence = new StringBuffer();
        
        for(String w: words) sentence.append(w);        //add worlds to the string buffer
        
        sentence.reverse();                             //lol you can just reverse it like this 
        
        String trimSentence = sentence.substring(0, 8);     //trim a string to the indexes you specify
        
        System.out.println("trimmed sentence is " + trimSentence);
        
        return sentence.toString();
    }
    
}
