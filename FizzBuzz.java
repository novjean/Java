/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;
import java.util.Scanner;
/**
 *
 * @author Novjean
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        String [] fizzbuzz = new String [n];
        
        for(int i=1;i<=n;i++)
        {
                if(i%3 == 0 && i%5 == 0)
                    fizzbuzz[i-1] = "FizzBuzz";
                    //System.out.println("FizzBuzz");
                else if(i%3 == 0)
                    fizzbuzz[i-1] = "Fizz";
                    //System.out.println("Fizz");
                else if(i%5 == 0)
                    fizzbuzz[i-1] = "Buzz";
                    //System.out.println("Buzz");
                else
                    fizzbuzz[i-1] = Integer.toString(i);
                    //System.out.println(Integer.toString(i));
        }
        for(int i = 0; i<n; i++)
        {
            System.out.println(fizzbuzz[i]);
        }
    }
    
}

/*

 public List<String> fizzBuzz(int n) {
        
        List<String> fizzbuzz = new ArrayList<String>();
       
        
        for(int i=1;i<=n;i++)
        {
                if(i%3 == 0 && i%5 == 0)
                    fizzbuzz.add("FizzBuzz");
                else if(i%3 == 0)
                    fizzbuzz.add("Fizz");
                else if(i%5 == 0)
                    fizzbuzz.add("Buzz");
                else
                    fizzbuzz.add(Integer.toString(i));
        }
        
        return fizzbuzz;
    }

*/
