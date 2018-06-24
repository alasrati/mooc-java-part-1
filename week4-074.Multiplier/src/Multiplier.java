public class Multiplier {

    private int multiplicant;

    public Multiplier(int number) {
        this.multiplicant = number;
    }

    public int multiply(int otherNumber) {
        return otherNumber * this.multiplicant;
    }

}
