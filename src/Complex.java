import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Complex {

    private List<Pool> Pools = new ArrayList<Pool>();

    private List<Guest> Guests = new ArrayList<Guest>();

    public List<Pool> getPools() {
        return Pools;
    }

    public List<Guest> getGuests() {
        return Guests;
    }

    public void addGuest(String name) {
        this.Guests.add(new Guest(name));
    }

    /**
     * addPool adds the pool to the complex if no other pool exists with this id
     * @param id Unique identifier
     * @param name
     * @param capacity Max persons allowed in the pool
     */
    public void addPool(int id, String name, int capacity) {
        if (isPoolAdded(id)) return;

        this.Pools.add(new Pool(id, name, capacity));
    }

    /**
     * isPoolAdded checks if the pool has been added to the complex already
      * @param id
     * @return Boolean
     */
    private boolean isPoolAdded(int id) {
        return this.getPools().stream().filter(p -> Objects.equals(p.getId(), id)).count() > 0;
    }

}
