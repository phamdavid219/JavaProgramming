package day30_CustomClass;

public class Dog {
    public String name;
    public int age;
    public char gender;
    public String breed;
    public char size;
    public String color;
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
turning a class into a custom class

Attributes:
    name:
    age:
    gender:
    breed:
    size:
    color:
Actions:
    eat() play() bark() sleep()
 */