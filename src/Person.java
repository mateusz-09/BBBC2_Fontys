public class Person {

    private String Name;

    private double Temperature;

    private double BloodAlcohol;

    public Person(String name) {
        setName(name);
    }

    public Person(String name, double temp, double bloodAlcohol) {
        setName(name);
        setTemperature(temp);
        setBloodAlcohol(bloodAlcohol);
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public double getTemperature() {
        return Temperature;
    }

    private void setTemperature(double temperature) {
        Temperature = temperature;
    }

    public double getBloodAlcohol() {
        return BloodAlcohol;
    }

    private void setBloodAlcohol(double bloodAlcohol) {
        BloodAlcohol = bloodAlcohol;
    }

    /**
     * checkHealth checks if the person's temperature and blood alcohol levels are ok to enter the pool
     * @return boolean
     */
    public Boolean checkHealth() {
        return getTemperature() <= 38.0 && getBloodAlcohol() <= 0.5;
    }

    public void takeBodyMeasurements(double temp, double bloodAlcohol) {
        setTemperature(temp);
        setBloodAlcohol(bloodAlcohol);
    }
}
