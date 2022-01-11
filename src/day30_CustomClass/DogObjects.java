package day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        System.out.println(dog1);
        Dog dog2 = new Dog();
        dog2.name="Jerry";
        dog2.breed="Labrador";
        dog2.age=4;
        dog2.gender='M';
        System.out.println(dog2);
    }
}
