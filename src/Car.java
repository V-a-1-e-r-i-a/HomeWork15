package transport;
import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearbox;
    private final String bodyType;
    private String registrationPlateNumber;
    private final int seatQuantity;
    private boolean winterTyres;
    private Key key;

    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume, String gearbox, String bodyType, String registrationPlateNumber,
               int seatQuantity, boolean winterTyres, Key key) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (gearbox == null || gearbox.isEmpty()) {
            this.gearbox = "A";
        } else {
            this.gearbox = gearbox;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "sedan";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationPlateNumber == null || registrationPlateNumber.isEmpty()) {
            this.registrationPlateNumber = "X000XX000";
        } else {
            this.registrationPlateNumber = registrationPlateNumber;
        }
        if (seatQuantity < 2 || seatQuantity > 9) {
            throw new IndexOutOfBoundsException("Количество мест должно быть от 2 до 9, включая водителя");
        } else {
            this.seatQuantity = seatQuantity;
        }
        this.winterTyres = winterTyres;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume) {
        this(brand, model, productionYear, productionCountry, color, engineVolume, "A", "sedan",
                "x000xx000", 5, true, new Key());
    }

    public boolean isWinterTyres() {
        return winterTyres;
    }

    public Key getKey() {
        return key;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear &&
                seatQuantity == car.seatQuantity && winterTyres == car.winterTyres && Objects.equals(brand, car.brand)
                && Objects.equals(model, car.model) && Objects.equals(color, car.color)
                && Objects.equals(productionCountry, car.productionCountry) && Objects.equals(gearbox, car.gearbox)
                && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationPlateNumber,
                car.registrationPlateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, gearbox,
                bodyType, registrationPlateNumber, seatQuantity, winterTyres);
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", " + "Модель: " + model + ", " + "Год производства: " + productionYear + ", " +
                "Страна сборки: " + productionCountry + ", " + "Цвет кузова: " + color + ", " +
                String.format("Объем двигателя - %.1f l." , engineVolume) + "Коробка передач: " + gearbox + ", " +
                "Тип кузова: " + bodyType + ", " + "Регистрационный номер: " + registrationPlateNumber + ", " +
                "Количество мест: " + seatQuantity + ", " + (isWinterTyres() ? "Зимняя" : "Летняя") + " резина" + ", " +
                (getKey().isKeylessAccess() ? "доступ без ключа" : "доступ с ключа") + ", " +
                (getKey().isRemoteStartEngine() ? "Удаленный запуск двигателя." : "классический запуск двигателя.");
    }

    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
}
