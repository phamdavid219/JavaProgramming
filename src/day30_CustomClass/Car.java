package day30_CustomClass;

public class Car {
    public String brand;
    public String model;
    public double price;
    public String color;
    public int year;

    public void setInfo(String carBrand,String carModel, double carPrice,String carColor, int carYear){
        brand = carBrand;
        model = carModel;
        price = carPrice;
        color = carColor;
        year = carYear;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
    public void drive(){
        System.out.println(brand+" "+model+" has started.");
    }
    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }
}
//this is just a template to build the car class. nothing is run on this