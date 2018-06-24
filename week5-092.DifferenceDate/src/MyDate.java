public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate compareDate) {
        int days = this.day + 30 * this.month + 365 * this.year;
        int compareDays = compareDate.day + 30 * compareDate.month + 365 * compareDate.year;
        int differenceInDays = 0;
        if (this.earlier(compareDate)) {
            differenceInDays = compareDays - days;
        } else {
            differenceInDays = days - compareDays;
        }
        return (differenceInDays - (differenceInDays % 365)) / 365;
    }
}
