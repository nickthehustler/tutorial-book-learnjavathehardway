public class CreatingVariables {
  public static void main(String [] args) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;

    int times;
    double frequency;
    String country, danceName;

    x = 10;
    y = 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    times = 100;
    frequency = 10000;
    country = "United States";
    danceName = "Mr. Happy";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number:" + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println("I'm from " + country + " and my dance name is " + danceName +". I also vibrate at the frequency of " + frequency + " GHz.");
  }
}
