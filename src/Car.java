package Transport;
import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private String country;
    private String gear;
    private final String bodyType;
    private String regNumber;
    private final int capacity;
    private boolean summerTyres;
    private Key key;

    public static  class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;
        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }
        public boolean isRemoteRun() {
            return remoteRun;
        }
        public boolean isWithoutAccess() {
            return withoutAccess;
        }
        @Override
        public String toString() {
            return (remoteRun? "удалённый запуск двигателя," : "без удалённого запуска двигателя,") + " " +
                    (withoutAccess? "бесключевой доступ" : "бесключевой доступ отсутствует");
        }
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String gear,
               String bodyType,
               String regNumber,
               int capacity,
               boolean summerTyres,
               Key key) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        setCountry(country);
        setGear(gear);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Автомат";
        }
        this.bodyType = bodyType;
        setRegNumber(regNumber);
        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        setKey(key);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume () {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume){
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }
    public String getColor () {
        return color;
    }
    public void setColor (String color){
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }
    public int getYear () {
        return year;
    }
    public String getCountry () {
        return country;
    }
    public void setCountry (String country){
        if (country == null || country.isEmpty()) {
            country = "defaulet";
        }
        this.country = country;
    }
    public String getGear () {
        return gear;
    }
    public void setGear (String gear){
        if (gear == null || gear.isEmpty()) {
            gear = "Автомат";
        }
        this.gear = gear;
    }
    public String getBodyType () {
        return bodyType;
    }
    public String getRegNumber () {
        return regNumber;
    }
    public void setRegNumber (String regNumber){
        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "X000XX000";
        }
        this.regNumber = regNumber;
    }
    public int getCapacity () {
        return capacity;
    }
    public boolean isSummerTyres () {
        return summerTyres;
    }
    public void setSummerTyres (boolean summerTyres){
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void chageTyres (int month){
        if (month >= 11 && month <= 12 || (month >= 1 && month <= 3)){
            summerTyres = false;
        }
        if (month >= 4 && month <= 10){
            summerTyres = true;
        }
    }

    @Override
    public String toString () {
        return  "Марка: " + getBrand() +
                " \nМодель: " + getModel() +
                " \nГод производства: " + year +
                " \nСтрана сборки: " + getCountry() +
                " \nЦвет кузова: " + getColor() +
                " \nОбъем двигателя - " + engineVolume +
                " \nКоробка передач: " + gear +
                " \nТип кузова: " + bodyType +
                " \nРегистрационный номер: " + regNumber +
                " \nКоличество мест: " + capacity +
                (summerTyres ? "\nЗимняя" : "\nЛетняя") + " резина" + ", " +
                key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return regNumber.equals(car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }
}