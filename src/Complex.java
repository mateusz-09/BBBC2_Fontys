import java.util.ArrayList;

public class Complex {
    private ArrayList<Pool> pools;
    private ArrayList<Guest> guests ;

    public Complex(Pool pools) {
        this.pools = new ArrayList<>();
    }

    public ArrayList<Pool> getPools() {
        return this.pools;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void addPool(Pool pool) {
        this.pools.add(pool);
    }

}
