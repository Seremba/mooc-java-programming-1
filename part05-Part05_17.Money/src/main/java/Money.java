
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money money = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return money;
    }

    public boolean lessThan(Money compared) {
        if ((100 * euros + cents) < (100 * compared.euros() + compared.cents())) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int euroDiff = this.euros - decreaser.euros;
        int centsDiff = this.cents - decreaser.cents;

        if (centsDiff < 0) {
            centsDiff += 100;
            euroDiff -= 1;
        }
        if (euroDiff < 0) {
            return new Money(0, 0);
        }

        return new Money(euroDiff, centsDiff);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
