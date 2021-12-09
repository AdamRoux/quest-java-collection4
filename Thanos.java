import java.util.Comparator;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        Comparator<Hero> ComparatorName = new Comparator<Hero>() {

  			@Override
  			public int compare(Hero hero1, Hero hero2) {
  				// TODO Auto-generated method stub
  				return hero1.getName().compareTo(hero2.getName());
  			}
        };
        
        TreeMap<Hero,Flower> party = new TreeMap<>(ComparatorName);
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);
        party.put(captainAmerica, lily);
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        if (party.containsValue(begonia)) {
      	  System.out.println("begonia se trouve dans le tableau associatif");
        } 
        else {
      	  System.out.println("FALSE !! Begonia ne se trouve PAS dans le tableau associatif!");
        }

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Hero hero : party.keySet()) {
      	  Flower flower = party.get(hero);
      	  System.out.println(hero.getName() +" : " + flower.getName());
        }

    }
}
