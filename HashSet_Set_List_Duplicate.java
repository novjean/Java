/*
find duplicate values in a list
 */
package findduplicateinlists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Novjean
 */
public class FindDuplicateInLists {

  
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,2,3);
        
        Set<Integer> duplicateValues = FindDuplicates(myList);
        
        for(Integer yourInt : duplicateValues){
            System.out.print(" " +yourInt);
        }
        
    }
    
    public static Set<Integer> FindDuplicates(List<Integer> myList){
        final Set<Integer> returnSet = new HashSet();                   //subset of the sbstractSet with hashing properties
        final Set<Integer> set1 = new HashSet();
        
        for(Integer yourInt: myList)
        {
            if(!set1.add(yourInt)) //returns true is successfully added to the list
            {
                returnSet.add(yourInt);
            }
        }
        return returnSet;
    }
    
}
