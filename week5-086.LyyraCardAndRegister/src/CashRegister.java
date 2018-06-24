
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double ecoPrice = 2.50;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= ecoPrice) {
            //    the price of lunch is added to register
            this.cashInRegister += ecoPrice;
            //    the amount of sold lunch is incremented by one
            this.economicalSold++;
            //    method returns cashGiven - lunch price
            return cashGiven - ecoPrice;
        } else {
            // if not enough money given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetPrice = 4.00;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= gourmetPrice) {
            //    the price of lunch is added to register
            this.cashInRegister += gourmetPrice;
            //    the amount of sold lunch is incremented by one
            this.gourmetSold++;
            //    method returns cashGiven - lunch price
            return cashGiven - gourmetPrice;
        } else {
            // if not enough money given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double ecoPrice = 2.50;
        boolean transactionSuccessful = card.pay(ecoPrice);
        if (transactionSuccessful) {
            this.economicalSold++;
        }
        return transactionSuccessful;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetPrice = 4.00;
        boolean transactionSuccessful = card.pay(gourmetPrice);
        if (transactionSuccessful) {
            this.gourmetSold++;
        }
        return transactionSuccessful;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
}
