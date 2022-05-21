package model;

public class Car {
    String color;
    String manufacturer;
    int mileage;

    public Car(String color, String manufacturer, int mileage) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight='" + manufacturer + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
