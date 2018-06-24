public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        value++;
        if (value > upperLimit) {
            value = 0;
        }
    }

    public String toString() {
        return String.format("%02d",this.value);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        if (value >= 0 && value <= this.upperLimit) {
            this.value =value;
        }
    }
}
