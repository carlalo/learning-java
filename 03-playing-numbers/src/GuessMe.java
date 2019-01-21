import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessMe
{
  public static void main(String args[])
  {
    int max = 10;
    int min = 1;
    
    int number = ThreadLocalRandom.current().nextInt(min,max);
    int guess  = -1;
    int tries  = 3;
    
    Scanner console = new Scanner(System.in);
    
    while (tries > 0 && number != guess) {
      System.out.print(String.format("You have %1d tries left. What is my number between %1d and %1d? ", tries, min, max));
      String attempt = console.nextLine();
      guess = Integer.parseInt(attempt);
      
      if (guess > number) {
        System.out.println("Nope, my number is lower.");
      } else if (guess < number) {
        System.out.println("Nope, my number is higher.");
      } else {
        System.out.println("Yes, that is my number :-)");
        break;
      }
      --tries;
    }
    
    console.close();
    
    if (number != guess) {
      System.out.println(String.format("My number was %1d. Thanks for playing.", number));
    }
  }
}
