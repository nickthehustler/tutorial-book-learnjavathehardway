import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute, happiness;
    boolean allowed, allowed2;

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    System.out.print("Enter your yearly income: ");
    income = keyboard.nextDouble();

    System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    System.out.print("How happy do you make them, on a scale from 0.0 to 10.0? ");
    happiness = keyboard.nextDouble();

    allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));
    allowed2 = (age > 25 && age < 40 && happiness > 7.0);

    System.out.println("Allowed to date my grandchild? " + allowed);
    System.out.println("Will the other grandmother allow you to date the grandchild? " + allowed2);

  }
}
