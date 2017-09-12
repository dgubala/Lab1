
package lab1;
import java.util.Scanner;
import java.util.*;

//lab 1 - part 4 
public class lab1 {

    public static void main(String[] args){

      //  Scanner scan = new Scanner(System.in);
      
      //scanner will not work when executing via gradle so for now n is being set in the code
        int n = 15;
       

        //System.out.println("Pick a Number!");
        
        // n = scan.nextInt();
        

       
        List<String> fizzBuzzList = new ArrayList<String>();
        

                      
                      
            for (int i = 0; i< n + 1; i++) {

                 if (i % 3 == 0 && i % 5 == 0) {
         
                fizzBuzzList.add("fizz buzz");
                    
                 } else if (i % 3 == 0) {
     
                fizzBuzzList.add("fizz");
                
                 } else if (i % 5 == 0) {

                fizzBuzzList.add("buzz");
                
                 } else {

                   fizzBuzzList.add(String.valueOf(i)); 
                } 
            
            
             }
        
        
              for(int x = 1; x < fizzBuzzList.size(); x++)
               {
            
                    System.out.println(fizzBuzzList.get(x));
               }

    }



}