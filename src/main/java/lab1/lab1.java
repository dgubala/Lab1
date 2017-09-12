package lab1;
import java.util.Scanner;
import java.util.*;

//lab 1 - part 3 
public class lab1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = 0;
       

        System.out.println("Pick a Number!");
        
        n = scan.nextInt();
        
        String[] newArray = new String[n + 1];
      
        
        newArray = fizzBuzzArray(n,newArray);
        
        for(int x = 1; x < newArray.length; x++)
        {
            
            System.out.println(newArray[x]);
        }

    }



     public static String[] fizzBuzzArray(int n, String[] newArray)
       {
         
           //newArray = new String[n + 1];

    
              for (int i = 1; i< n + 1; i++) {

                 if (i % 3 == 0 && i % 5 == 0) {
                    //System.out.println("fizz buzz");
                    newArray[i] = "fizz buzz";
                 } else if (i % 3 == 0) {
                    //System.out.println("fizz");
                newArray[i] = "fizz";
                 } else if (i % 5 == 0) {
                    //System.out.println("buzz");
                newArray[i] = "buzz";
                 } else {
                   //System.out.println(i);
                   newArray[i] = String.valueOf(i);
                } 
            
            
              }
            
        return newArray;
        
     }
}