public class Main
{
public static void main(String[] args)
{
CarLombok c = new CarLombok ("Impreza", "Subaru", "Blue", 2006, 5, 25000);
CarLombok c2 = new CarLombok("Impreza", "Subaru", "White", 2012, 3, 32000);
  System.out.println(c);
  System.out.println(c2);
  System.out.println(c.getColor());
  int year = c.getYear();
  c2.setColor("Beige");
  System.out.println("Are the cars equal? " + c.equals(c2));
  System.out.println("Hashcode of c is " + c.hashCode());
  System.out.println("Hashcode of c2 is " + c2.hashCode());
    }
}