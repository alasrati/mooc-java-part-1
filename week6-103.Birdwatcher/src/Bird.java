public class Bird {

    private int observed;
    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public int getObserved() {
        return observed;
    }

    public void observe() {
        this.observed++;
    }

    public String toString() {
        return name + " (" + latinName + "): " + observed + " observations";
    }

}
