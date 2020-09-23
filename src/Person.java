public class Person {

    private String name;
    private double temperature;
    private double bloodAlcohol;

    public Person(String name, double temperature, double bloodAlcohol) {
        this.name = name;
        this.temperature = temperature;
        this.bloodAlcohol = bloodAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodAlcohol() {
        return bloodAlcohol;
    }

    public void setBloodAlcohol(double bloodAlcohol) {
        this.bloodAlcohol = bloodAlcohol;
    }

    public boolean isHealthy(){
        double bloodAlcohol = this.bloodAlcohol;
        double temperature = this.temperature;
        if(bloodAlcohol  <= 0.5 || temperature < 38){
            return false;
        }
        return true;
    }

    public void takeBodyMeasurements(double temperature, double bloodAlcohol){
        this.bloodAlcohol = bloodAlcohol;
        this.temperature = temperature;
    }
}
