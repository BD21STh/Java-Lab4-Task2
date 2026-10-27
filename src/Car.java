public class Car
{
    private String model, brand, color; private int year, quantity; private double price;
public Car (String model, String brand, String color, int year, int quantity, double price)
{
    this.model = model; this.brand = brand; this.color = color;
    this.year = year; this.quantity = quantity; this.price = price;
}
    public void setBrand(String brand) { this.brand = brand; }
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public void setModel(String model) {this.model = model;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public void delivery() { quantity++; }
    public void sell() { quantity--; }
    @Override
    public String toString()
    {
        return "Model: " + model + ", brand: " + brand + ", color: " + color
                + ", year: " + year + ", quantity: " + quantity + ", price: " + price;

    }
}
