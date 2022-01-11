package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        //multiple variable in one line
        String name = "James Harvy",
               building = "B123",
               streetAddress = "Clifton Lane",
               city = "Peachtree City",
               state = "GA";
        int zipCode = 30269;

        System.out.println(name + "\n" + building + " " + streetAddress + "\n" + city + ", " + state + " " + zipCode
        );


    }

}
/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

 */