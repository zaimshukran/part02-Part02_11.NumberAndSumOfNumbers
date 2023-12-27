
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        while(true){
            System.out.println("Give a number: ");
            int input = Integer.parseInt(scanner.nextLine());

            if(input == 0){
                break;
            }
            
            counter++;
            total += input;
        }

        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + total);
    }
}
