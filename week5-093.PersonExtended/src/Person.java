import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        Calendar now = Calendar.getInstance();
        int nowDate = now.get(Calendar.DATE);
        int nowMonth = now.get(Calendar.MONTH) + 1; // January is 0 so we add one
        int nowYear = now.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(nowDate, nowMonth, nowYear);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        Calendar now = Calendar.getInstance();
        int nowDate = now.get(Calendar.DATE);
        int nowMonth = now.get(Calendar.MONTH) + 1; // January is 0 so we add one
        int nowYear = now.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(nowDate, nowMonth, nowYear);
        return today.differenceInYears(birthday);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return (this.birthday.earlier(compared.birthday));
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

}
