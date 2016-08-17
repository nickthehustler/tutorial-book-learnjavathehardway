import java.util.Scanner;

public class BMICalculator {
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, height, feet, inches, weight, bmi;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    inches =  keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    weight = keyboard.nextDouble();

    height = 12 * feet + inches;

    m = 0.0254 * height;
    kg = 0.453592 * weight;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
