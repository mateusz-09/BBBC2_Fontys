public class Person {

    private String Name;

    private Double Temperature;

    private Double BloodAlcohol;

    public Person(String name) {

    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public Double getTemperature() {
        return Temperature;
    }

    private void setTemperature(Double temperature) {
        Temperature = temperature;
    }

    public Double getBloodAlcohol() {
        return BloodAlcohol;
    }

    private void setBloodAlcohol(Double bloodAlcohol) {
        BloodAlcohol = bloodAlcohol;
    }

    public Boolean checkHealth() {
        return true;
    }

    public void takeBodyMeasurements(Double temp, Double bloodAction) {

    }
}
