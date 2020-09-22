import java.util.ArrayList;
import java.util.List;

public class Pool {

    private String Name;

    private int Id;

    private int Capacity;

    private List<Guest> Guests = new ArrayList<Guest>();

    public Pool(int id, String name, int capacity) {

    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
    }

    public int getCapacity() {
        return Capacity;
    }

    private void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public List<Guest> getGuests() {
        return Guests;
    }

    public Boolean isAllowedToEnter(Guest guest) {
        return true;
    }

    public void checkInGuest(Guest guest) {

    }

}
