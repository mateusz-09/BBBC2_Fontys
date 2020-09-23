import java.util.ArrayList;
import java.util.List;

public class Pool {
    private int id;
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    // Constructor
    public Pool(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public Boolean isAllowedToEnter(Guest guest) {
        if(guest.getBloodAlcohol() > 0.5 || guest.getTemperature() > 38.0) {
            return false;
        }
        return true;
    }

    public boolean checkInGuest(Guest guest) {
        int totalGuests = 0;
        for (Guest guestWhoWantsToSwim : this.guests){
            totalGuests += 1;
        }
        if (totalGuests > this.capacity){
            return false;
        }
        guests.add(guest);
        return true;
    }

}
