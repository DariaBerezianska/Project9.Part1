// creat a new class and objects in Main
class Car {
    // private properties
    private int priceInDollars;
    private boolean onSale;
    private String colour;
    //public properties
    public String brand;
    public int yearOfManufacture;

    // constructor with arguments + print to the console inside the constructor
    public Car(String brand, int priceInDollars, int yearOfManufacture, String colour) {
        this.brand = brand;
        this.priceInDollars = priceInDollars;
        this.yearOfManufacture = yearOfManufacture;
        this.colour = colour;
        System.out.println("Constructing a new car, brand: " + brand);
    }

    // private method
    private double priceInHryvnias() {
        return priceInDollars * 37.15;
    }

    //getters and setters for private properties
    public void setPrice(int price) {
        priceInDollars = price;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public boolean getOnSale() {
        return onSale;
    }

    // public method + access to these properties inside the class from the methods + demonstrate the access to these properties inside the class from the methods
    public void printDetails() {
        System.out.println("Brand: " + brand + ", Price in $: " + priceInDollars + ", year of manufacture of this car: " + yearOfManufacture + ", colour: " + colour);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lexus", 65000, 2021, "red");
        car1.printDetails(); // call public method
        Car car2 = new Car("Toyota", 37000, 2020, "black");
        car2.printDetails(); // call public method
        Car car3 = new Car("Audi", 45000, 2019, "white");
        car3.printDetails(); // call public method
        //demonstrate the use of getters and setters
        car1.setOnSale(true);
        car1.setPrice(61000);
        car2.setOnSale(false);
        car2.setPrice(35000);
        car3.setOnSale(true);
        car3.setPrice(40000);
        if (car1.getOnSale()) {
            System.out.println(car1.brand + " is on sale, new price in $:" + car1.getPriceInDollars());
        }
        if (car2.getOnSale()) {
            System.out.println(car2.brand + " is on sale, new price in $:" + car2.getPriceInDollars());
        }
        if (car3.getOnSale()) {
            System.out.println(car3.brand + " is on sale, new price in $:" + car3.getPriceInDollars());
        }
        //an access to public properties through object
        System.out.println("The first car is " + car1.brand);
        //an access to private properties through object ERROR
//        System.out.println(car2.colour);
        // call private method outside the class Car ERROR
//        System.out.println(car1.priceInHryvnias());
    }
}