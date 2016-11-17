
package diceprobability;
import java.util.Random;
/**
 *
 * @author Novjean
 */
public class DiceProbability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int freq[] = new int[7];
        
        for(int roll = 1; roll<1000; roll++)
        {
            ++freq[1+rand.nextInt(6)];
        }
        
        System.out.println("The frequency of the faces are: \nface\tfrequency ");
        for(int i=1;i<=6;i++)
        {
            System.out.println(i+"\t"+freq[i]);
        }
    }
    
}
