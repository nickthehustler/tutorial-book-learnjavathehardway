public class ArrayIntro {
  public static void main(String [] args) {
    String [] planets = {"Mercury", "Venus", "Earth", "Mars",
                        "Jupiter", "Saturn", "Uranus", "Neptune"};

    for(String planet:planets) {
      System.out.println(planet + "\t" + planet.toUpperCase());
    }

    String [] celebrities = {"Justin Bieber", "Kanye West", "Beyonce",
                             "Taylor Swift", "Dwayne Johnson", "Vin Diesel"};

    for(String celebrity:celebrities) {
      System.out.println(celebrity + " is a famous person");
    }
  }
}
