public class Person {

    private String Name;

    private Double Temperature;

    private Double BloodAlcoholLevel;

    public Person(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double temperature) {
        Temperature = temperature;
    }

    public Double getBloodAlcoholLevel() {
        return BloodAlcoholLevel;
    }

    public void setBloodAlcoholLevel(Double bloodAlcoholLevel) {
        BloodAlcoholLevel = bloodAlcoholLevel;
    }

    protected Boolean IsAllowedToEnter() {
        return this.Temperature <= 38.0 && this.BloodAlcoholLevel <= 0.5;
    }

}

