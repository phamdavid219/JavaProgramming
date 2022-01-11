package day30_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Toyota","Camry",34499.99,"White",2021);
        System.out.println(car1);
        Car car2 = new Car();
        car2.setInfo("Audi","A5",44675.99,"Black",2019);
        System.out.println(car2);
    }
}
