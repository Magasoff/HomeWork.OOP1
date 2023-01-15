public class Main {
    public static void main(String[] args) {
        Car car = new Car(null, null, 0, null, null, null);
        System.out.println(car);
        Car car1 = new Car("Lada", "Granta", 1.7, 2015, "Россия", "белый");
        System.out.println(car1);
        Car car2 = new Car("Audi", "A8", 3, 2020, "Германия", "чёрный");
        System.out.println(car2);
        Car car3 = new Car("BMW", "Z8", 3, 2021, "Германия", "черный");
        System.out.println(car3);
        Car car4 = new Car("Kia", "Sportage 4", 2.4, 2018, "Южная Корея", "красный");
        System.out.println(car4);
        Car car5 = new Car("Huyndai", "Avante", 1.6, 2016, "Южная Корея", "оранжевый");
        System.out.println(car5);
        Car car6 = new Car(null, null, 0, null, null, null);
        System.out.println(car6);
    }
}


//Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
//Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
//BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
//Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
//Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.