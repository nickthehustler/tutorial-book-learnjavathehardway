import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main(String [] args) throws Exception {
    PrintWriter fileout = new PrintWriter("receipt.txt");
    Scanner keyboard = new Scanner(System.in);
    double pricePerGallon, totalCost, gallons;

    pricePerGallon = 1.959;

    System.out.println("Gas costs $ " + pricePerGallon + " per gallon.");
    System.out.print("How many gallons do you want? ");
    gallons = keyboard.nextDouble();

    totalCost = pricePerGallon * gallons;
    System.out.println("Total cost: $ " + totalCost);
    System.out.println("Writing customized receipt to 'receipt.txt'...done.");

    fileout.println( "+------------------------+" );
    fileout.println( "|                        |" );
    fileout.println( "|      CORNER STORE      |" );
    fileout.println( "|                        |" );
    fileout.println( "|   2014-06-25 04:38PM   |" );
    fileout.println( "|                        |" );
    fileout.println( "| Gallons: " + gallons + "        |" );
    fileout.println( "| Price/gallon: $ " + pricePerGallon + "  |" );
    fileout.println( "|                        |" );
    fileout.println( "| Fuel total: $ " + Math.round(totalCost * 100.0)/100.0 + "    |" );
    fileout.println( "|                        |" );
    fileout.println( "+------------------------+" );
    fileout.close();
  }
}
