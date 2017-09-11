import java.util.Scanner;

//lab 1 - part 2 
public class lab1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = 0;

        System.out.println("Pick a Number!");
        n = scan.nextInt();

        for (int i=1; i<n + 1; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
