//Written by Rayna Carter
//2019
public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;

    public Car (int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = 0;

    }

    public void setYear(int year) {

        this.year = year;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public void drive(int miles) {

        this.miles += miles;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getYear() {

        return year;
    }

    public String getMake() {

        return make;
    }

    public int getMiles() {

        return miles;
    }

    public String getModel() {

        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", miles=" + miles +
                ", model='" + model + '\'' +
                '}';
    }
}
