public class Car {
    //Attributes
    String brand;
    String model;
    int year;

    //Constructor

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    //Methods
    public void startEngine(){
        System.out.println("The " + year +" " + brand +" "+ model + " engine Started" );
    }
}
