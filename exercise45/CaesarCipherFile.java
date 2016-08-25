import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipherFile {
  /**
   * Returns the character shifted by the given number of letters
   * CaesarCipherFile will only receive data from a file and write to a file
   */
  public static char shiftLetter(char c, int n) {
    int u = c;

    if(!Character.isLetter(c))
      return c;

    u = u + n;
    if(Character.isUpperCase(c) && u > 'Z'
    || Character.isLowerCase(c) && u > 'z') {
      u -= 26;
    }
    if(Character.isUpperCase(c) && u < 'A'
    || Character.isLowerCase(c) && u < 'a') {
      u += 26;
    }

    return (char)u;
  }

  public static void main(String [] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String plaintext, cipher = "";
    String inputFileName = "message.txt";
    String outputFileName = "cipher.txt";
    String defaultMessage = "Quick brown fox";
    int shift;

    File f1 = new File(inputFileName);
    if(f1.exists() && f1.length() > 0) {
      Scanner input = new Scanner(f1);
        plaintext = input.nextLine();
      input.close();

      System.out.println("Message: " + plaintext);
    }
    else {
      System.out.println("Save game file doesn't exist or is empty.");
      System.out.println("The default message will be " + defaultMessage);
      plaintext = defaultMessage;
    }

    System.out.print("Shift (0-26): ");
    shift = keyboard.nextInt();

    for(int i = 0; i < plaintext.length(); i++) {
      cipher += shiftLetter(plaintext.charAt(i), shift);
    }
    System.out.println(cipher);

    File f2 = new File(outputFileName);
    PrintWriter out = new PrintWriter(f2);
      out.println(cipher);
    out.close();
  }
}
