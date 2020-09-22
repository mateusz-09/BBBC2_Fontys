import java.util.ArrayList;
import java.util.List;

public class Pool {

    private int Id;

    private int Capacity;

    private List<Guest> Guests = new ArrayList<Guest>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public List<Guest> getGuests() {
        return Guests;
    }

    public void setGuests(List<Guest> guests) {
        Guests = guests;
    }

    public void Save() {
        // This function will save this object to a txt file.
    }

}
