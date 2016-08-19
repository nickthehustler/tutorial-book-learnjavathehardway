import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String answer;

    System.out.print("Give me a number, and I'll find its square root. ");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    System.out.print("Are you ready?!? ");
    System.out.print("(Enter 'YES!' to continue.) ");
    answer = keyboard.next();

    while (!answer.equals("YES!")) {
      System.out.print("It seems like you aren't ready to proceed.\n");
      System.out.print("Are you ready?!? ");
      System.out.print("(Enter 'YES!' to continue.) ");
      answer = keyboard.next();
    }

    while (x < 0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }
}
