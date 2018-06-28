import java.util.HashMap;

public class Observations {

    private HashMap<String, Bird> birds;
    private static final String NOT_A_BIRD = "Is not a bird!";

    public Observations() {
        this.birds = new HashMap<String, Bird>();
    }

    public void addBird(String name, String latinName) {
        birds.put(name, new Bird(name, latinName));
    }

    public void observeBird(String name) {
        if (birds.containsKey(name)) {
            birds.get(name).observe();
        } else {
            System.out.println(NOT_A_BIRD);
        }
    }

    public void showBird(String name) {
        if (birds.get(name) != null) {
            System.out.println(birds.get(name));
        } else {
            System.out.println(NOT_A_BIRD);
        }
    }

    public void statistics() {
        for (Bird bird : birds.values()) {
            System.out.println(bird);
        }
    }
}
