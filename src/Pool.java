import java.util.ArrayList;
import java.util.List;

public class Pool {

    private String Name;

    private int Id;

    private int Capacity;

    private List<Guest> Guests = new ArrayList<Guest>();

    public Pool(int id, String name, int capacity) {
        setId(id);
        setName(name);
        setCapacity(capacity);
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

    /**
     * isAllowedToEnter Checks if the guest can enter the pool
     * @param guest
     * @return boolean
     */
    public Boolean isAllowedToEnter(Guest guest) {
        if (getGuests().size() >= getCapacity()) {
            return false;
        }

        if (!guest.checkHealth()) {
            return false;
        }

        return true;
    }

    public void checkInGuest(Guest guest) {
        this.Guests.add(guest);
    }

}
