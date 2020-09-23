import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    private static Complex Complex = new Complex();

    private static Scanner IntScanner = new Scanner(System.in);

    private static Scanner DoubleScanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadPools();
        loadGuests();

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1: Guest enters pool");

            int option = IntScanner.nextInt();

            switch (option) {
                case 1 -> guestEntersPool();
            }
        }
    }

    private static void guestEntersPool() {
        listAllPools();
        System.out.println("Which pool?");

        int poolId = IntScanner.nextInt();

        listAllGuests();
        System.out.println("Which guest?");

        int guestId = IntScanner.nextInt();

        /*  This is equal to: get the first pool with the given Id
            It's like this in a foreach loop:

            List<Pool> pools = new ArrayList<Pool>();

            for (Pool p in Complex.getPools()) {
                if (p.getId() == id) {
                    pools.Add(p);
                }
            }

            Pool pool = pools.get(0);
         */
        Pool pool = Complex.getPools().stream().filter(p -> Objects.equals(p.getId(), poolId)).collect(Collectors.toList()).get(0);
        Guest guest = Complex.getGuests().get(guestId);

        System.out.println("What's the temperature of the guest?");
        double temp = DoubleScanner.nextDouble();

        System.out.println("What's the blood alcohol level of the guest?");
        double bloodAlcohol = DoubleScanner.nextDouble();

        guest.takeBodyMeasurements(temp, bloodAlcohol);

        if (!pool.isAllowedToEnter(guest)) {
            System.out.println("Guest is not allowed to enter pool.");
            return;
        }

        pool.checkInGuest(guest);
    }

    private static void loadPools() {
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            Complex.addPool(i, "Pool_" + i, rnd.nextInt(3));
        }
    }

    private static void loadGuests() {
        for (int i = 0; i < 100; i++) {
            Complex.addGuest("Piet" + i);
        }
    }

    private static void listAllPools() {
        for (Pool p : Complex.getPools()) {
            System.out.printf("%d: %s%n", p.getId(), p.getName());
        }
    }

    private static void listAllGuests() {
        for (Guest g : Complex.getGuests()) {
            System.out.printf("%d: %s%n", Complex.getGuests().indexOf(g), g.getName());
        }
    }
}
