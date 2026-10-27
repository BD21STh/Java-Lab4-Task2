public class Main
{
public static void main(String[] args)
{
Car c = new Car ("Impreza", "Subaru", "Blue", 2006, 5, 25000);
  System.out.println(c.toString());
  c.sell();
  System.out.println("Model: " + c.getModel() + " Brand: " + c.getBrand() + " Color: " + c.getColor() + " Year: " + c.getYear() + " Quantity: " + c.getQuantity() + " Price: " + c.getPrice());
  c.setColor(" Silver "); c.setPrice(24000);
  System.out.println(c.toString());






}

}
