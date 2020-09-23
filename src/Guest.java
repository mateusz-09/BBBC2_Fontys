public class Guest extends Person {

    public Guest(String name, double temperature, double bloodAlcohol) {
        super(name, temperature, bloodAlcohol);
        boolean registrationStatus;
    }


    private boolean isRegistered(String choice){
        String choiceValue = choice.toLowerCase();
        if(choiceValue.equals("yes")){
            return true;
        } else if(choiceValue.equals("no")){
            return false;
        }
        return false;
    }

}
