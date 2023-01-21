import Transport.Car;
public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(
                "Lada",
                "Granta",
                1.7,
                "Жёлтый",
                2015,
                "Россия",
                "Механика",
                "Седан",
                "Н988Н193",
                5,
                true,
                new Car.Key(true,false));
        System.out.println(ladaGranta);

        Car audiA8 = new Car(
                "Audi",
                "A8 50L TDI quattro",
                3.0,
                "Чёрный",
                2020,
                "Германия",
                "Aвтомат",
                "Седан",
                "Н989Н193",
                4,
                true,
                new Car.Key(false,true));
        System.out.println(audiA8);

        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3.0,
                "Чёрный",
                2021,
                "Германия",
                "Механика",
                "Кабриолет",
                "Н990Н193",
                2,
                false,
                new Car.Key(true,false));
        System.out.println(bmwZ8);

        Car kiaSportage = new Car(
                "Kia",
                "Sportage 4th generation",
                2.4,
                "Красный",
                2018,
                "Южная Корея",
                "Автомат",
                "Кросовер",
                "Н991Н193",
                5,
                true,
                new Car.Key(false,false));
        System.out.println(kiaSportage);

        Car hyundaiAvante = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея",
                "Автомат",
                "Седан",
                "Н993Н193",
                5,
                true,
                new Car.Key(true,true));
        System.out.println(hyundaiAvante);
    }
}