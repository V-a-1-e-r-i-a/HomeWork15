import transport.Car;
public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия",
                "Желтый", 1.7, "M", "sedan", "Н988Н193",
                5, true, new Car.Key());
        Car audiA8 = new Car("Audi", "A8 50L TDI quattro", 2020, "Германия",
                "Черный", 3.0, "A", "sedan", "Н989Н193",
                4, true, new Car.Key(true, true));
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия",
                "Черный", 3.0, "M", "cabriolet", "Н990Н193",
                2, false, new Car.Key());
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2018,
                "Южная Корея", "Красный", 2.4, "A", "suv",
                "Н991Н193", 5, true, new Car.Key(true, true));
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея",
                "Оранжевый", 1.6, "A", "sedan", "Н993Н193",
                5, true, new Car.Key());

        System.out.println(ladaGranta + "\n");
        System.out.println(audiA8 + "\n");
        System.out.println(bmwZ8 + "\n");
        System.out.println(kiaSportage + "\n");
        System.out.println(hyundaiAvante + "\n");
    }
}