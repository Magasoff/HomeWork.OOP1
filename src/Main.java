public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "Желтый";
        ladaGranta.year = 2015;
        ladaGranta.country = "Россия";
        System.out.println(" Марка автомобиля: " + ladaGranta.brand + " Модель автомобиля: " + ladaGranta.model + " объем двигателя: " + ladaGranta.engineVolume +
                " Цвет автомобиля: " + ladaGranta.color + " год выпуска автомобиля: " + ladaGranta.year + " страна сборки автомобиля: " + ladaGranta.country);

        Car AudiA8 = new Car();
        AudiA8.brand = "Audi A8";
        AudiA8.model = "50 L TDI quattro";
        AudiA8.engineVolume = 3.0;
        AudiA8.color = "Черный";
        AudiA8.year = 2020;
        AudiA8.country = "Германия";
        System.out.println(" Марка автомобиля: " + AudiA8.brand + " Модель автомобиля: " + AudiA8.model + " объем двигателя: " + AudiA8.engineVolume +
                " Цвет автомобиля: " + AudiA8.color + " год выпуска автомобиля: " + AudiA8.year + " страна сборки автомобиля: " + AudiA8.country);

        Car BMW = new Car();
        BMW.brand = "BMW";
        BMW.model = "Z8";
        BMW.engineVolume = 3.0;
        BMW.color = "Черный";
        BMW.year = 2021;
        BMW.country = "Германия";
        System.out.println(" Марка автомобиля: " + BMW.brand + " Модель автомобиля: " + BMW.model + " объем двигателя: " + BMW.engineVolume +
                " Цвет автомобиля: " + BMW.color + " год выпуска автомобиля: " + BMW.year + " страна сборки автомобиля: " + BMW.country);

        Car KIA = new Car();
        KIA.brand = "Kia";
        KIA.model = "Spotage 4";
        KIA.engineVolume = 2.4;
        KIA.color = "Красный";
        KIA.year = 2018;
        KIA.country = "Южная Корея";
        System.out.println(" Марка автомобиля: " + KIA.brand + " Модель автомобиля: " + KIA.model + " объем двигателя: " + KIA.engineVolume +
                " Цвет автомобиля: " + KIA.color + " год выпуска автомобиля: " + KIA.year + " страна сборки автомобиля: " + KIA.country);

        Car Huyndai = new Car();
        Huyndai.brand = "Huyndai";
        Huyndai.model = "Avante";
        Huyndai.engineVolume = 1.6;
        Huyndai.color = "Оранжевый";
        Huyndai.year = 2016;
        Huyndai.country = "Южная Корея";
        System.out.println(" Марка автомобиля: " + Huyndai.brand + " Модель автомобиля: " + Huyndai.model + " объем двигателя: " + Huyndai.engineVolume +
                " Цвет автомобиля: " + Huyndai.color + " год выпуска автомобиля: " + Huyndai.year + " страна сборки автомобиля: " + Huyndai.country);
    }
}