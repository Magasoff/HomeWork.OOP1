public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final Integer year;
    private final String country;
    private final String color;

    public Car(String brand, String model, double enginePower, Integer year, String country, String color) {
        this.brand = validateCarParametres(brand);
        this.model = validateCarParametres(model);
        this.engineVolume = validateEnginePower(engineVolume);
        this.color = validateCarColor(color);
        this.year = validateYear(year);
        this.country = validateCarParametres(country);
    }

    @Override
    public String toString() {
        return " Марка автомобиля: " + brand + " Модель автомобиля: " + model + " объем двигателя: " + engineVolume +
                " Цвет автомобиля: " + color + " год выпуска автомобиля: " + year + " страна сборки автомобиля: " + country;
    }

    public static double validateEnginePower(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null ? 2000 : value;
    }

    private static String validateCarColor(String value) {
        return value == null ? "белый" : value;
    }

    public static String validateCarParametres(String Value) {
        return Utile.validateString(Value, "default");
    }
}


