public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void increase(int amount) {
        if (amount > 0) {
            this.value += amount;
        }
    }

    public void decrease(int amount) {
        if (amount > 0) {
            if (this.check) {
                if (this.value - amount <= 0) {
                    this.value = Math.min(0, this.value);
                } else {
                    this.value -= amount;
                }
            } else {
                this.value -= amount;
            }
        }
    }
}
